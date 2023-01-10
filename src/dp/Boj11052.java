package dp;

import java.util.Scanner;

public class Boj11052 {
    static int[] dp;
    static int[] p;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        p = new int[N+1];
        dp = new int[N+1];

        for(int i=1;i<=N;i++) {
            p[i] = in.nextInt();
        }

        int max=0;
        int cur=0;
        for(int i=1;i<=N;i++) {
            for(int j=1;j<i;j++) {
                cur = dp[j]+p[i-j];
                if(max<cur) max = cur;
            }
            dp[i] = Math.max(p[i],max);
        }

        System.out.println(dp[N]);
        in.close();
    }

    
}
