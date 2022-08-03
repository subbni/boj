package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Boj4963 {
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int[] diagonalY = {-1,-1,1,1};
    static int[] diagonalX = {-1,1,-1,1};
    static boolean map[][];
    static int W,H;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb= new StringBuffer();

        while(true) {
            W = in.nextInt();
            H = in.nextInt();
            map = new boolean[H][W];
            
            if(W==0 && H==0) break;

            for(int h=0; h<H; h++) {
                for(int w=0;w<W;w++) {
                    map[h][w] = (in.nextInt()==1);
                }
            }

            sb.append(bfs()).append('\n');
            
        }

        System.out.print(sb);
        in.close();
    }

    static int bfs() {
        int cnt=0;
        Queue<int []> q= new LinkedList<>();

        for(int i=0;i<H;i++) {
            for(int j=0;j<W;j++) {
                if(!map[i][j]) continue;

                q.add(new int[]{i,j});
                map[i][j] = false;
                cnt++;

                while(!q.isEmpty()) {
                    int cur[] = q.poll();

                    for(int k=0;k<4;k++) {
                        int x = cur[0]+dy[k];
                        int y = cur[1]+dx[k];

                        if(x<0 || y<0 || x>=H|| y>=W || !map[x][y]) continue;

                        q.add(new int[]{x,y});
                        map[x][y] = false;
                    }

                    // 대각선
                    for(int k=0;k<4;k++) {
                        int x = cur[0]+diagonalY[k];
                        int y = cur[1]+diagonalX[k];

                        if(x<0 || y<0 || x>=H || y>=W || !map[x][y]) continue;

                        q.add(new int[]{x,y});
                        map[x][y] = false;
                    }   
                }

            }
        }

        return cnt;
    }

}
