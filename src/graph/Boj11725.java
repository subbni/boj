package graph;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Boj11725 {
    static int N;
    static List<Integer>[] list;
    static int[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        list = new ArrayList[N+1];
        visited = new int[N+1];

        int a,b;
    

        for(int i=0;i<=N;i++) {
            list[i] = new ArrayList<>();
        }

        for(int i=0;i<N-1;i++) {
            a = in.nextInt();
            b= in.nextInt();
            list[a].add(b);
            list[b].add(a);
        }


        visited[0]=1;
        visited[1]=1;

        dfs(1);

        for(int i=2;i<=N;i++) {
            System.out.println(visited[i]);
        }
        in.close();
    }

    static void dfs(int start) {
    
        int node=0;
        for(int i=0;i<list[start].size();i++) {
            node = list[start].get(i);
            if(visited[node]>0) continue;
            visited[node]=start;
            dfs(node);
        }
    }
}
