package io;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj10953 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        in.nextLine();

        for(int i=0;i<times;i++) {
            StringTokenizer st = new StringTokenizer(in.nextLine(),",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);

        }

        in.close();

    }
}
