package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2146 {
    static int[] dy= {-1,1,0,0};
    static int[] dx= {0,0,-1,1};
    static int[][] graph;
    static boolean[][] visited;
    static int color=1;
    static int N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        N = in.nextInt();
        graph = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                graph[i][j]= in.nextInt();
            }
        }

        color = 2;

        // 각 대륙 색칠하기
        colorLands();
        for(int i=0;i<N;i++) {
            Arrays.fill(visited[i],false);
        }

        System.out.println(buildBridge());
        in.close();

    }

    static void colorLands() {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(visited[i][j] || graph[i][j]==0) continue;

                q.add(new int[] {i,j});
                visited[i][j]=true;
                graph[i][j]=color;
                while(!q.isEmpty()) {
                    int[] cur = q.poll();

                    for(int k=0;k<4;k++) {
                        int ny = cur[0]+dy[k];
                        int nx = cur[1]+dx[k];

                        if(ny<0 || nx<0 || ny>=N || nx>=N || visited[ny][nx] || graph[ny][nx]==0) continue;

                        q.add(new int[] {ny,nx});
                        visited[ny][nx]=true;
                        graph[ny][nx]=color;
                    }
                }
                color++;
            }
        }
    }

    static int buildBridge() {
        Queue<int[]> q = new LinkedList<>();
        int min=Integer.MAX_VALUE;
        int land;
        int i,j;
        for(i=0;i<N;i++) {
            for(j=0;j<N;j++) {

               if(graph[i][j]==0) continue;

               // 대륙을 만났을 때
               land = graph[i][j];
               int cnt=0;

               q.add(new int[]{i,j});
               visited[i][j]=true;

               while(!q.isEmpty()) {
                if(cnt>=min) break;
                int[] cur = q.poll();
                cnt++;

                // 다리 생성됨
                if(graph[cur[0]][cur[1]]>0 && graph[cur[0]][cur[1]]!=land) {
                    min=cnt;
                }
                for(int k=0;k<4;k++) {
                    int ny = cur[0]+dy[k];
                    int nx = cur[1]+dx[k];

                    if(ny<0 || nx<0 || ny>=N || nx>=N || visited[ny][nx] || graph[ny][nx]>0) continue;

                    // 0이라면
                    q.add(new int[]{ny,nx});
                    visited[ny][nx] = true;
                }
               }


               
            }
        }

        return min;
    }
}
