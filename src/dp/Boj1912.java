package dp;

import java.util.Scanner;

public class Boj1912 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] val = new int[N];
        int[] dp = new int[N];

        for(int i=0;i<N;i++) {
            val[i] = in.nextInt();
            dp[i] = val[i];
        }

        int max=dp[0];
        for(int i=1;i<N;i++) {
            if(dp[i-1]+val[i]>val[i]) dp[i]=dp[i-1]+dp[i];
            if(max<dp[i]) max=dp[i];
        }
        
        System.out.println(max);
        in.close();

    }
}
