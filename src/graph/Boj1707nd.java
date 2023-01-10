package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Boj1707nd {
    static int V,E;
    static List[] list;
    static int[] color;
    static boolean isBiGraph;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int K = in.nextInt();

        for(int k=0;k<K;k++) {

            V = in.nextInt();
            E = in.nextInt();

            color = new int[V+1];
            list = new ArrayList[V+1];
            for(int v=0;v<=V;v++) {
                list[v]= new ArrayList<>();
            }

            int vertex;
            int to;
            for(int e=0;e<E;e++) {
                vertex = in.nextInt();
                to = in.nextInt();
                list[vertex].add(to);
                list[to].add(vertex);
            }

            isBiGraph = true;
            // for(int v=1;v<=V;v++) {
            //     if(color[v]==0) bfs(v);
            // }

            color[1]=1; dfs(1);
            for(int v=2;v<=V;v++) {
                if(color[v]==0) dfs(v);
            }

            sb.append(isBiGraph? "YES":"NO").append('\n');

        }

        System.out.print(sb);
        in.close();
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        color[start] = 1;

        while(!q.isEmpty() && isBiGraph) {
            int current = q.poll();

            for(int i=0;i<list[current].size();i++) {
                int to = (int)list[current].get(i);

                if(color[to]==0) {
                    color[to] = (-1)*color[current];
                    q.add(to);
                    continue;
                } else if(color[to]==color[current]) {
                    isBiGraph = false;
                }
            }
        }
    }

    static void dfs(int start) {
        for(int i=0;i<list[start].size();i++) {
            int to = (int)list[start].get(i);
            if(color[to]==0) {
                color[to]=(-1)*color[start];
                dfs(to);
            } else if(color[to]==color[start]) {
                isBiGraph=false; break;
            }

        }
    }
}
