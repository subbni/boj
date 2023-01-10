package dp;

import java.util.Scanner;

public class Boj2011 {
    static long[] dp;
    static StringBuffer sb;
    static int N;
    static int one;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sb = new StringBuffer(in.next());
        N = sb.length();
        dp = new long[N+1];

        

        System.out.println(one+dynamic(N-1));
        in.close();
    }

    static long dynamic(int n) {
        if(n==0) {
            if(sb.charAt(n)=='0') return 0;
            else return 1;
        }

        if(dp[n]!=0) return dp[n];

        dp[n] = dynamic(n-1);

        if(sb.charAt(n)=='0') {
            if(one==0) one=1;
        } 

        String str=sb.substring(n-1,n+1).toString();
        if(sb.substring(n-1,n+1).toString().compareTo("27")<0) dp[n]++;

        return dp[n];
    }


}
