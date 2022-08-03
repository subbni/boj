package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Edge {
    int vertex;
    int distance;
    public Edge(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }
}

public class Boj1167 {
    static int V;
    static List<Edge>[] list;
    static boolean[] visited;
    static int end;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        V = in.nextInt();
        list = new ArrayList[V+1];
        visited = new boolean[V+1];

        for(int i=0;i<=V;i++) {
            list[i] = new ArrayList<Edge>();
        }

        int vertex=-1;
        int target;

        for(int i=0;i<V;i++) {
            vertex = in.nextInt();
            target = in.nextInt();
            while(target!=-1) {
                list[vertex].add(new Edge(target,in.nextInt()));
                target = in.nextInt();
            }
        }

        
        Edge first = dfs(1,0);
        Arrays.fill(visited,false);
        Edge back = dfs(first.vertex,0);
        System.out.println(back.distance);
        in.close();

    }

    static Edge dfs(int start, int sum) {
        visited[start]=true;
        Edge max = new Edge(start,sum);

        for(Edge e : list[start]) {
            if(!visited[e.vertex]) {
                Edge ret = dfs(e.vertex,sum+e.distance);
                if(max.distance<ret.distance) {
                    max = ret;
                }
            }

        }
        return max;

        // for(int i=0;i<list[start].size();i++) {
        //     cur = list[start].get(i).vertex;
        //     if(visited[cur]==visited[start]) continue;
        //     visited[cur]=visited[start];
            
        //     end = list[start].get(i).vertex;
        //     cur = list[start].get(i).distance + dfs(cur,sum+);
        //     if(cur>distance) {
        //         distance = cur; 
        //     }
        // }

        // return distance;
    }

}
