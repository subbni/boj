package basicmath;

import java.util.Scanner;


public class Boj2745 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer n = new StringBuffer(in.next());
        int b = in.nextInt();

        long answer=0;
        
        n = n.reverse();
        int temp;
        for(int i=0;i<n.length();i++) {
            temp = transfer(n.charAt(i));
            temp *= Math.pow(b, i);
            answer += temp;
        }

        System.out.println(answer);
        in.close();

    }

    public static int transfer(char c) {
        if(c>=65) {
            return c-55;
        } else {
            return c-48;
        }
    }
}
