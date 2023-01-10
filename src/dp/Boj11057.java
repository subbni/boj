package dp;

import java.util.Scanner;

public class Boj11057 {
    static int[][] memo;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        memo = new int[N+1][10];

        for(int i=0;i<=9;i++) {
            if(i==9) memo[1][i]=1;
            else memo[1][i]=(10-i);
        }
        
        System.out.println(dfs(N,0));
        in.close();
    }

    public static int dfs(int digit, int num) {

        if(digit==1) return memo[digit][num];
        if(num==9) return 1;
        if(memo[digit][num]!=0) return memo[digit][num];

        int sum=0;
        for(int i=num;i<=9;i++) {
            sum += dfs(digit-1,i);
        }

        return memo[digit][num]=sum%10007;
    }
 }
