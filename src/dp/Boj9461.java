package dp;

import java.util.Scanner;

public class Boj9461 {
    static long[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T>0) {
            int N = in.nextInt();
            dp = new long[101];
            dp[1]=dp[2]=dp[3]=1;
            dp[4]=2; dp[5]=2;
            System.out.println(dynamic(N));
            T--;
        }
        in.close();
    }

    static long dynamic(int n){
        if(n<=5) return dp[n];
        if(dp[n]!=0) return dp[n];
        return dp[n]=dynamic(n-1)+dynamic(n-5);
    }    
}
