package basicmath;

import java.util.Scanner;


// 최대공약수
public class Boj1934 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b;
        int minMultiple;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++) {
             a = in.nextInt();
             b = in.nextInt();
             minMultiple=1;

            if(a==1 || b==1) {
                if(a==1) minMultiple=b;
                else minMultiple=a;
            } else {
                while(true) {
                    int j=2;
                    for(; j<=Math.min(a,b);) {
                        if(a%j==0 && b%j==0) {
                            a = a/j;
                            b = b/j;
                            minMultiple *= j;
                        } else {
                            j++;
                        }
                    }
                    minMultiple *= a*b;
                    break;
                }
            }

            sb.append(minMultiple).append('\n');
        }

        System.out.println(sb);
        in.close();
    }
}
