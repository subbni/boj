package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2178 {
    final static int MAX = 201;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dy = {-1,1,0,0};
        int[] dx = {0,0,-1,1};

        int N = in.nextInt();
        int M = in.nextInt();

        boolean graph[][] = new boolean[N][M];
        int path[][] = new int[N][M];

        

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++) {
            sb.delete(0,sb.length());
            sb.append(in.next());
            Arrays.fill(path[i],MAX);
            for(int j=0;j<M;j++) {
                graph[i][j] = sb.charAt(j)=='1';
            }
        }

  
        Queue<int []> q = new LinkedList<>();
        
        q.add(new int[]{0,0});
        path[0][0]=1;

        int cnt=0;
        while(!q.isEmpty()) {
            int cur[]= q.poll();
            cnt = path[cur[0]][cur[1]];

            if(cur[0]==N-1 && cur[1]==M-1) break;
            for(int k=0;k<4;k++) {
                int ny = cur[0]+dy[k];
                int nx = cur[1]+dx[k];

                // 갈 수 없는 경우
                if(ny<0 || nx<0 || ny>=N || nx>=M || !graph[ny][nx] || path[ny][nx]!=MAX) continue;
                
                // if(path[ny][nx]< cnt+1) continue;

                path[ny][nx]=cnt+1;
                q.add(new int[]{ny,nx});
            }

        }

        System.out.println(path[N-1][M-1]);
        in.close();

    }
}
