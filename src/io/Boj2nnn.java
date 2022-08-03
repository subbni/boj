package io;

import java.util.Scanner;

public class Boj2nnn {
    public static void main(String[] agrs) {
        boj2446();
    }

    static void boj2742() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=n;i>=1;i--) {
            System.out.println(i);
        }
        in.close();

    }

    static void boj2739() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i =1; i<=9; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
        in.close();
    }

    static void boj2438() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int b=1;b<=n-i;b++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
System.out.println();
        }
        in.close();
    }

    static void boj2440() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=n;i>0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }

    static void boj2441() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0;i<n;i++) {
            for(int b=0;b<i;b++) {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }

    static void boj2442() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int format = 2*n-1;
        int star=0;
        for(int i=1;i<=n;i++) {
            star = 2*i-1;
            for(int b=1;b<=(format-star)/2;b++) {
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }

    static void boj2445() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int b=0;b<2*n-2*i;b++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int b=0;b<2*n-2*i;b++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }

    static void boj2446() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=n;i>0;i--) {
            for(int b=0;b<(2*n-2*i)/2;b++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++) {
                System.out.print("*");                
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++) {
            for(int b=0;b<(2*n-2*i)/2;b++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++) {
                System.out.print("*");                
            }
            System.out.println();
        }
in.close();
      
    }
}
