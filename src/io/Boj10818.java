package io;

import java.util.Scanner;

public class Boj10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=-1000000;
        int min=1000000;
        int tmp=0;
        for(int i=0;i<n;i++) {
            tmp = in.nextInt();
            if(tmp>max) max=tmp;
            if(tmp<min) min=tmp;
        }

        System.out.println(min+" "+max);
        in.close();
    }
}
