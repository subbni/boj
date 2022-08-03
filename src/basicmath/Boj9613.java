package basicmath;

import java.util.Scanner;

public class Boj9613 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        long result;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<t;i++) {
            result = 0;
            n = in.nextInt();
            int[] arr = new int[n];

            for(int tmp=0;tmp<n;tmp++) {
                arr[tmp] = in.nextInt();
            }

            for(int j=0;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    result += GCD(arr[j],arr[k]);
                }
            }

            sb.append(result).append('\n');
        }

        System.out.print(sb);
        in.close();
    }

    public static int GCD(int a, int b) {
        int gcd=1;
        if(a==1 || b==1) {
            return gcd;
        }

        for(int i=2;i<=Math.min(a,b);) {
            if(a%i==0 && b%i==0) {
                a = a/i;
                b = b/i;
                gcd *= i;
            } else {
                i++;
            }
        } 

        return gcd;
    }
}
