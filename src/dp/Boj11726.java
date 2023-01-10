package dp;

import java.util.Scanner;

public class Boj11726 {
    static int[] mem;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        mem = new int[n+2];
        System.out.println(dp(n));
        in.close();
    }

    static int dp(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(mem[n]!=0) return mem[n];

        
        return mem[n]=(dp(n-1)+dp(n-2))%10007;

    }
}
