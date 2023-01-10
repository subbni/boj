package dp;

import java.util.Scanner;

public class Boj11727 {
    static int[] mem;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        mem = new int[n+1];
        System.out.println(dp(n));
        in.close();
    }

    static int dp(int n) {
        if(n==1) return 1;
        if(n==2) return 3;
        if(mem[n]!=0) return mem[n];

        
        return mem[n]=(dp(n-1)+2*dp(n-2))%10007;

    }
}
