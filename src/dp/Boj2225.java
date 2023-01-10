package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Boj2225 {
    static long[][] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        
        dp = new long[K+1][N+1];
        Arrays.fill(dp[1],1);

        System.out.println(dynamic(K,N));
        in.close();


    }   

    static long dynamic(int k,int n) {
        if(dp[k][n]!=0) return dp[k][n];
        for(int i=n;i>=0; i--) {
            dp[k][n] += dynamic(k-1,i)%1000000000;
        }
        return dp[k][n]%1000000000;
    }
}
