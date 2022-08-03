package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Boj1707 {
    static List<Integer>[] list;
    static int color[];
    static int V;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int E;
     //   boolean isBipartite;


        for(int k=0;k<K;k++) {

            V = in.nextInt();
            E = in.nextInt();

            list = new ArrayList[V+1];
            color = new int[V+1];

            for(int i=0;i<V+1;i++) {
                list[i] = new ArrayList<>();
            }

            int a,b;
            for(int j=0;j<E;j++) {
                a = in.nextInt();
                b = in.nextInt();

                list[a].add(b);
                list[b].add(a);
            }

            isBiGraph(1,1);

            // if(isBipartite) {
            //     System.out.println("YES");
            // } else {
            //     System.out.println("NO");
            // }

        }

        in.close();

    }

    public static boolean bfs(int start, int c) {

        Queue<Integer> q = new LinkedList<>();
        int node;
        q.add(start);
        color[start] = 1;


        int next;
        while(!q.isEmpty()) {
            node = q.remove();

            if(list[node].contains(node)) return false;

            for(int i=0;i<list[node].size();i++) {
                next = list[node].get(i);
                if(color[next]==0) {
                    color[next] = color[node]*(-1);
                    q.add(next);
                } else if(color[next]==color[node]) {
                    return false;
                }
            }
        }

        return true;

    }

static void isBiGraph(int start, int c) {
		Queue<Integer> q = new LinkedList<>();


        // 주어진 그래프에 있는 모든 정점이 다 연결되어 있는 것은 아니다.
        // 한 그래프 안에 서로 연결되지 않은 그래프가 2개 이상 존재할 수 있다.

		for(int i=1; i< V+1; i++) {

			if(color[i]==0) {
				color[i] =1;
				q.add(i);
			}
		
			while(!q.isEmpty()) {
				int pos = q.poll();
				
				for(int next : list[pos]) {
                    if(color[next] == color[pos]) {
						System.out.println("NO");
						return;
					}
                    
					if(color[next] ==0) {
						q.add(next);
                        color[next] = color[pos]*(-1);
					}
				}
			}
		}
		
		System.out.println("YES");
	}

    public static boolean dfs(int start, int c) {
        color[start] = c;

        // 루프가 있는 경우 이분 그래프가 될 수 없다.
        if(list[start].contains(start)) return false;

        // for(int i=1;i<graph.length;i++) {
        //     if(graph[start][i]==1 && color[i]==0) {
        //         dfs(i,c*(-1));
        //     } else if(graph[start][i]==1 && color[i]==color[start]) {
        //         return false;
        //     }
        // }
        return true;

    }
}
