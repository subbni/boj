package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj7576 {
    static int dy[] = {-1,1,0,0};
    static int dx[] = {0,0,-1,1};
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int[][] tomato = new int[N][M];

        Queue<int[]> q = new LinkedList<>();
        int cnt=0;
        int days=0;

        for(int n=0;n<N;n++) {
            for(int m=0;m<M;m++) {
                tomato[n][m] = in.nextInt();
                if(tomato[n][m]==1) {
                    q.add(new int[]{n,m});
                
                }    else if(tomato[n][m]==0) cnt++;
            }
        }


        while(cnt>0 && !q.isEmpty()) {
            for(int s=q.size();s>0;s--) {
                int cur[] = q.poll();

                for(int k=0;k<4;k++) {
                    int ny = cur[0]+dy[k];
                    int nx = cur[1]+dx[k];
       
                    if(ny<0 || nx<0 || ny>=N || nx>=M || tomato[ny][nx]!=0) continue;

                    // 0을 1로 바꿀 때마다 cnt를 하나씩 감소시킨다.
                    cnt--;                    
                    tomato[ny][nx]=1;
                    q.add(new int[]{ny,nx});
                }
            }
            days++;
        }


        // 모든 0이 1로 바뀌었다면 cnt==0, 바뀌지 못 한 0이 있으면 -1을 출력한다.
        System.out.println(cnt == 0 ? days : -1);
        in.close();
      

    }

        
}