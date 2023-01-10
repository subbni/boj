package dp;

import java.util.Scanner;

public class Boj2192 {
    static long memo[];
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if(n==0) {
        System.out.println(0);
        // 입력으로 0이 주어지면 memo = new long[1]이 되고 memo[1]에 접근 불가능 -> ArrayOutOfBound 에러 발생
    } else {
        memo= new long[n+1];
        memo[0]=0;
        memo[1]=1;   
        System.out.println(dfs(n));
    }

    in.close();
   } 

   static long dfs(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    if(memo[n]>0) return memo[n];

    return memo[n]=dfs(n-1)+dfs(n-2);
   }
}
