package dp;

import java.util.Scanner;

public class Boj2579 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] score = new int[N];
        int[] dp = new int[N];

        for(int i=0;i<N;i++) {
            score[i] = in.nextInt();
            dp[i] = score[i];
        }

     
        for(int i=1;i<N;i++) {
            if(i==1) {
                dp[i] = dp[i]+dp[i-1]; 
                continue;
            } 
            if(i==2) {
                dp[i] = Math.max(score[0]+score[2],score[1]+score[2]);
                continue;
            }
            dp[i] = Math.max(dp[i-2]+score[i],dp[i-3]+score[i-1]+score[i]);
            
        }

        System.out.println(dp[N-1]);
        in.close();
    }
}
