package dp;

import java.util.Scanner;

public class Boj2133 {
    static int[] memo;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        memo = new int[N+1];
        memo[0]=1;
        System.out.println(dp(N));
        in.close();
    }

    static int dp(int n) {
    
        if(n%2!=0) return 0;
        if(memo[n]!=0) return memo[n];
        int sum= dp(n-2)*3;
        for(int i=4;i<=n;i+=2) {
            sum += dp(n-i)*2;
        }
        return memo[n]=sum;
    }
}
