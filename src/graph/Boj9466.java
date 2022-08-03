package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boj9466 {
    static int[] team;
    static List[] list;
    static int count;
    static int check[];
    static int cycleStartNode;
    static boolean isCycle=false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        
        for(int t=0;t<T;t++) {
            
            int N = in.nextInt();
            list = new ArrayList[N+1];
            team = new int[N+1];
            check = new int[N+1];
            Arrays.fill(team,-1);
            int result = N;
            count = N;

            
            
            for(int i=1;i<=N;i++) {
                list[i] = new ArrayList<Integer>();
                list[i].add(in.nextInt());
                if(list[i].get(0).equals(i)) team[i]=count--;
            }

            
            for(int n=1;n<=N;n++) {
                // self 선택
                if(team[n]>-1) {
                    continue;
                } else if (team[n]==-1) {
                    if(!teamMatching(n,n,n)) {
                        team[n]=0;
                    } 
                }
            }

            System.out.println(count);


        }
        in.close();
    }

    static boolean teamMatching(int node, int start, int n) {
        check[node] = n;
        
        if(team[node]>0) return false;
        
        int pos = (int)list[node].get(0);

        if(pos==start) {
            team[node]=count--;
            return true;
        }

        if(check[pos]==check[node]) {
            isCycle=true;
            cycleStartNode=pos;
            team[node]=count--;
            return false;
        }

        if(teamMatching((int)list[node].get(0),start,n)) {
            team[node]=count--;
            return true;
        } else {
            if(isCycle) {
                if(cycleStartNode==node) {
                    team[node]=count--;
                    isCycle=false;
                } else {
                    team[node]=count--;
                }
            }
            return false;
        }

    }
}
