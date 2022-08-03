package graph;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10451 {
    static int graph[];
    static int check[];
    static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N;

        for(int t=0;t<T;t++) {
            N = in.nextInt();

            graph= new int[N+1];
            check= new int[N+1];
            Arrays.fill(check,-1);
            for(int i=1;i<=N;i++) {
                graph[i] = in.nextInt();
            }

            count=0;
            for(int j=1;j<=N;j++) {
                if(graph[j]==j) {
                    // self cycle
                    check[j]=count++;
                }

                if(check[j]<0) {
                    // 아직 확인 되지 않은 노드
                    if(isCycle(j,j)) {
                        count++;
                    }
                }

            }
            System.out.println(count);
        }
       
        in.close();
    }

    static boolean isCycle(int node, int start) {
        if(check[node]!=-1) return false;
        
        if(graph[node]==start) return true;

        if(isCycle(graph[node],start)) {
            check[node]=count;
            return true;
        } else {
            return false;
        }
        
    }



}
