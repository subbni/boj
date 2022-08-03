package basicmath;

import java.util.Scanner;

public class Boj1850 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long maxDivisor=1;

        
        while(true) {
            for(int i=2;i<=Math.min(a,b);) {
                if(a%i==0 && b%i==0) {
                    a= a/i;
                    b= b/i;
                    maxDivisor *= i;
                } else {
                    i++;
                }
            }
            break;
        }

        System.out.println(maxDivisor);
        in.close();
    }
}
