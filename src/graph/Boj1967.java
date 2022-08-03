package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Boj1967 {
    static boolean visited[];
    static List<Edge>[] list;  
    static public class Edge {
        int vertex;
        int weight;
        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        list = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=0;i<=N;i++) {
            list[i] = new ArrayList<>();
            
        }
        
        
        int parent;
        int child;
        int weight;
        for(int i=0;i<N-1;i++) {
            parent = in.nextInt();
            child = in.nextInt();
            weight = in.nextInt();
            list[parent].add(new Edge(child,weight));
            list[child].add(new Edge(parent,weight));
        }
    
        Edge y = dfs(1,0);
        Arrays.fill(visited,false);
        Edge z = dfs(y.vertex,0);
        System.out.println(z.weight);
        in.close();

    }

    static Edge dfs(int start, int sum) {
        visited[start] = true;
        Edge max = new Edge(start,sum);
        Edge e;
   
        for(Edge to: list[start]) {
           // if(visited[to.vertex]==1) continue;
             if(visited[to.vertex]) continue; 
            
            e = dfs(to.vertex,sum+to.weight);
            if(max.weight<e.weight) {
                max = e;
            }
        }

        return max;

    }
}
