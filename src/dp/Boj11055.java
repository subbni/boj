package dp;

import java.util.Scanner;

public class Boj11055 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] val =  new int[N];
        int[] dp = new int[N];

        for(int i=0;i<N;i++) {
            val[i]=in.nextInt();
            dp[i] = val[i];
        }

        int max = 0;
        for(int i=0;i<N;i++) {
            if(max<dp[i]) max = dp[i];
            for(int j=i+1;j<N;j++) {
                if(val[j]>val[i]) {
                    dp[j] = Math.max(dp[j], dp[i]+val[j]);
                }
            }
        }

        System.out.println(max);
        in.close();
    }
}
