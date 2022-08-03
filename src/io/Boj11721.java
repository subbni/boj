package io;

import java.util.Scanner;

public class Boj11721 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for(int i=0;i<str.length();i+=10) {
            if(i+10>str.length()-1) {
                System.out.println(str.substring(i, str.length()));
            } else {
                System.out.println(str.substring(i, i+10));
            }
            
        }

        in.close();
    }
}
