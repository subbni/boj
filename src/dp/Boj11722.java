package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11722 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] val = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp,1);

        for(int n=0;n<N;n++) {
            val[n] = in.nextInt();
        }
        
        int max=0;
        for(int i=0;i<N;i++) {
            if(max<dp[i]) max = dp[i];
            for(int j=i+1;j<N;j++) {
                if(val[i]>val[j]) {
                    if(dp[j]<dp[i]+1) dp[j]=dp[i]+1;
                }
            }
        }
        System.out.println(max);
        in.close();

    }
}
