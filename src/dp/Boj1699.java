package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1699 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        dp = new int[N+1];

        System.out.println(dynamic(N));
        in.close();
    }

    public static int dynamic(int n) {
        if(n==0) return 0;
        if(dp[n]!=0) return dp[n];

        int power = (int)Math.floor(Math.sqrt(n));
        if(power*power == n) {
            dp[n]=1;
            return dp[n];
        }

        int min= Integer.MAX_VALUE;
        int cur=0;
        for(int i=1;i<=power;i++) {
            cur = dynamic(i*i)+dynamic(n-i*i);
            if(min>cur) {
                min = cur;
                if(min==2) break;
            }
        }


        return dp[n]=min;
    }
}
