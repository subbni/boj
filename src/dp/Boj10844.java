package dp;

import java.util.Scanner;

public class Boj10844 {
    static int N;
    static long[][] memo;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        memo = new long[N+1][10];
        
        for(int i=0;i<=9;i++) {
            memo[1][i]=1;
        }
        
        long result=0;
        for(int i=1;i<=9;i++) {
            result += dp(N,i);
        }
        System.out.println(result);
        in.close();
    }

    static long dp(int digit, int number) {
        if(digit==1) return memo[digit][number];

        if(memo[digit][number]==0) {
            if(number==0) return dp(digit-1,1);
            if(number==9) return dp(digit-1,8);
            memo[digit][number] = (dp(digit-1,number-1)+dp(digit-1,number-1));
        }
        return memo[digit][number]%1000000000;
      

    }
}

