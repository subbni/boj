package basicmath;

import java.util.Scanner;

// 두 정수의 최대공약수와 최소공배수 구하기
public class Boj2609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();


        int maxDivisor=1;
        int minMultiple=1;

        int a = A;
        int b = B;

        while(true) {
            int i=2;

            for(;i<=Math.min(a,b);) {
                if(a%i==0 && b%i==0) {
                    a = a/i;
                    b = b/i;
                    maxDivisor *= i;
                    minMultiple *= i;
                } else {
                    i++;
                }
             
            }
            minMultiple *= a*b;
            break;
        }

        System.out.println(maxDivisor);
        System.out.println(minMultiple);
        


        in.close();
    }

    
}
