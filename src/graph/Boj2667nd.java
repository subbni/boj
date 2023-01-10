package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Boj2667nd {
    // 항상 방문한 노드는 표시를 해서 두 번 가지 않도록 확실히 해두는 것이 중요함 !!!!!!! 
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int N;
    static boolean graph[][];
    static List<Integer> house;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        house = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        graph = new boolean[N][N];

        for(int i=0;i<N;i++) {
            sb.delete(0, sb.length());
            sb.append(in.next());
            for(int j=0;j<N;j++) {
                graph[i][j]= (sb.charAt(j)=='1');
            }
        }

        bfs();
        System.out.println(house.size());

        house.sort(null);
        for(int i=0;i<house.size();i++) {
            System.out.println(house.get(i));
        }

        in.close();

    }

    static void bfs() {
        Queue<int []> q = new LinkedList<>();

        int cnt;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(!graph[i][j]) continue;

                q.add(new int[]{i,j}); 
                graph[i][j]=false;
                cnt=0;

                while(!q.isEmpty()) {
                    int cur[] = q.poll();
                    cnt++;

                    for(int k=0;k<4;k++) {
                        int ny = cur[0]+dy[k];
                        int nx = cur[1]+dx[k];

                        if(nx<0 || ny<0 || nx>=N || ny>=N || !graph[ny][nx]) continue;

                        
                        q.add(new int[]{ny,nx});
                        graph[ny][nx]=false;
                    }
                }

                house.add(cnt);
            }
        }
    }
}
