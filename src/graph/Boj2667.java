package graph;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Boj2667 {
    
    static int[] dy = { -1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static boolean map[][];
    // 단지 수가 정해져 있지 않기 때문에 (몇 개가 될 지 모름) 배열이 아닌 연결리스트 선언
    static List<Integer> ans;
    static int N;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ans = new ArrayList<>();

        N = in.nextInt();
        StringBuffer sb = new StringBuffer();

        map = new boolean[N][N];

        for(int i=0;i<N;i++) {
            sb.delete(0,sb.length());
            sb.append(in.next());

            for(int j=0;j<N;j++) {
                map[i][j] = sb.charAt(j) =='1';
            }
        }

        bfs();
        System.out.println(ans.size());
        ans.sort(null);
        ans.stream().forEach(System.out::println);

        in.close();
    }

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(!map[i][j]) continue;

                q.add(new int[]{i,j});
                map[i][j]=false;
                int size = 0;

                while(!q.isEmpty()) {
                    int[] cur = q.poll();
                    size++;

                    for(int k=0;k<4;k++) {
                        int ny = cur[0]+dy[k];
                        int nx = cur[1]+dx[k];

                        if(ny<0 || nx<0 || ny>=N || nx>=N || !map[ny][nx]) continue;

                        q.add(new int[] {ny,nx});
                        map[ny][nx] = false;
                    }
                }
                ans.add(size);
            }
        }
    }


    
}
