package io;

import java.util.Scanner;

public class Boj11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        int result =0;

        String str = in.next();
        
        for(int i=0;i<times;i++) {

            result += str.charAt(i)-48;
        }

        System.out.println(result);

        in.close();
    }
}
