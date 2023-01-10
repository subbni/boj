package dp;

import java.util.Scanner;

public class Boj9465 {
    static int dp[][];
    static int score[][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        StringBuffer sb = new StringBuffer();
        
        for(int t=0;t<T;t++) {
            int N = in.nextInt();
            dp = new int[2][N];
            score = new int[2][N];

            for(int i=0;i<=1;i++) {
                for(int j=0;j<N;j++) {
                    score[i][j] = in.nextInt();
                    dp[i][j]=score[i][j];
                }
            }

            for(int i=1;i<N;i++) {
                if(i==1) {
                    dp[0][1] = score[0][1]+score[1][0];
                    dp[1][1] = score[1][1]+score[0][0];
                } else {
                    dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2])+dp[0][i];
                    dp[1][i] = Math.max(dp[0][i-1],dp[0][i-2])+dp[1][i];
                }
            }

            sb.append(Math.max(dp[0][N-1],dp[1][N-1])).append('\n');
            
        }

        System.out.print(sb);
        in.close();
    }
}
