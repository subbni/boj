package io;

import java.util.Scanner;

public class Boj1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int date = in.nextInt();
        int sum=0;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=0;i<month-1;i++) {
            sum += days[i];
        }
        sum+=date;
        sum= (sum%7);

        switch(sum) {
            case 0: System.out.println("SUN");
            break;
            case 1: System.out.println("MON");
            break;
            case 2: System.out.println("TUE");
            break;
            case 3: System.out.println("WED");
            break;
            case 4: System.out.println("THU");
            break;
            case 5: System.out.println("FRI");
            break;
            case 6: System.out.println("SAT");
            break;
        }
        in.close();
    }
}
