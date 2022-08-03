package dp;

import java.util.Scanner;

public class Boj9095 {
    static int dp[] = new int[11];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        dp[5]=2;
        for(int i=0;i<n;i++) {
            System.out.println(recur(in.nextInt()));
        } 
        in.close();

    }

    static int brute(int n) {
        int result=0;
        if(n==1) {
            result+= 1;
        } 
        if(n>=3) {
            result+=(n-1);
        }
        if(n>=4) {
            result+=(n-2);
        }
        if(n%2==0) {
            result+=n/2;
        }
        if(n%3==0) {
            result+=n/3;
        }
        if(n==5) {
            result+=2;
        }
        if(n==5 || n>=7) {
            int tmp=0;
            if(n-2>=5) {
                tmp+=dp[n-2];
            }
            if(n-3>=5) {
                tmp+=dp[n-3];
            }

            dp[n]+=tmp;
            result+=dp[n];
        }
        return result;

    }
    static int recur(int n) {

        if(n==1 || n==0) return 1;
        if(n<0) return 0;

        if(dp[n]!=0) {
            return dp[n];
        }
        else {
            dp[n]=recur(n-1)+recur(n/2-1)+recur(n/3-1)+recur(n/2)+recur(n/6)+recur(n/3);
            return dp[n];
        }
    }
}
