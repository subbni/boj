package graph;

import java.util.Scanner;

public class Boj11724 {

    static int graph[][];
    static int check[];
    static int count=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        graph = new int[N+1][N+1];
        check = new int[N+1];

    
        for(int i=0;i<M;i++) {
            graph[in.nextInt()][in.nextInt()] = 1;
        }


        for(int i=1;i<=N;i++) {

            if(check[i]==0) {
                connectedComponent(i);
                count++;
            }
        }

        System.out.println(count);
        in.close();

        
    }

    public static void connectedComponent(int start) {
        check[start]=1;
        
        for(int i=1;i<graph.length;i++) {
            if((graph[start][i]==1 || graph[i][start]==1)
            && check[i]==0) {
                connectedComponent(i);
            }
        }

        // 원래 graph[start][i]==1 && check[i]==0 로만 구성했더니 오답처리 됨.
        
    }
}
