package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

// Dfs Bfs 구현
public class Boj1260 {
    static int graph[][];
    static int check[];
    static Queue<Integer> q = new LinkedList<Integer>();;

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    int vertex = in.nextInt();

    graph = new int[N+1][N+1];
    check = new int[N+1];
 

    int a,b;
    for(int i=0; i<M ;i++) {
        a= in.nextInt();
        b = in.nextInt();
        graph[a][b]=1;
        graph[b][a]=1;
    }

    dfs(vertex);
    Arrays.fill(check,0);
    System.out.println();
    bfs(vertex);
    in.close();

   } 

   public static void dfs(int vertex) {
    System.out.print(vertex+" ");
    check[vertex] = 1;

    for(int i=1;i<graph.length;i++) {
        if(graph[vertex][i]==1 && check[i]==0) {
            dfs(i);
        }
    }
   }

   public static void bfs(int vertex) {
    int node;
    q.add(vertex);
    check[vertex] = 1;

    while(true) {
        try {
            node = q.remove();
        } catch(NoSuchElementException e) {
            return;
        }
        System.out.print(node+" ");
        

        for(int i=1;i<graph.length;i++) {
            if(graph[node][i]==1 && check[i]==0) {
                q.add(i);
                check[i] = 1;
            }
        }
    }
   }

}
