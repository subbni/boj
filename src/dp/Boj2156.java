package dp;

import java.util.Scanner;

public class Boj2156 {
    static int dp[];
    static int score[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        dp = new int[N+1];
        score = new int[N+1];
        dp[0]=score[0]=0;

        for(int i=1;i<=N;i++) {
            score[i] = in.nextInt();
        }

        for(int n=1;n<=N;n++) {
            if(n==1){
                dp[1] = score[1];
                continue;
            }
            if(n==2){
                dp[2]=score[1]+score[2];
                continue;
            }
            dp[n] = Math.max(dp[n-1],Math.max(dp[n-2]+score[n],score[n]+score[n-1]+dp[n-3]));
        }

        System.out.println(dp[N]);
        in.close();
        }
    
}
