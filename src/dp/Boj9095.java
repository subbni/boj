package dp;

import java.util.Scanner;

public class Boj9095 {
    static int memo[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int n;
        for(int i=0;i<t;i++) {
            n= in.nextInt();
            memo = new int[n+1];
            System.out.println(dp(n));
        } 

        in.close();

    }

    static int dp(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        if(memo[n]!=0) return memo[n];

        return memo[n] = dp(n-1)+dp(n-2)+dp(n-3);
    }


    /////// 이 밑은 대체 뭘 해놓은거지 ...?

    
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
                tmp+=memo[n-2];
            }
            if(n-3>=5) {
                tmp+=memo[n-3];
            }

            memo[n]+=tmp;
            result+=memo[n];
        }
        return result;

    }
    static int recur(int n) {

        if(n==1 || n==0) return 1;
        if(n<0) return 0;

        if(memo[n]!=0) {
            return memo[n];
        }
        else {
            memo[n]=recur(n-1)+recur(n/2-1)+recur(n/3-1)+recur(n/2)+recur(n/6)+recur(n/3);
            return memo[n];
        }
    }
}
