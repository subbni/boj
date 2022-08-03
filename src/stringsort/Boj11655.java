package stringsort;

import java.util.Scanner;

public class Boj11655 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();
        char c;

        for(int i=0;i<str.length();i++) {
            c = str.charAt(i);
            if(c>=65 && c<=90) {
                // 대문자
                if(c-13<65) {
                    c += 13;
                } else {
                    c -= 13; 
                }
            } else if(c>=97 && c<=122) {
                // 소문자
                if(c-13<97) {
                    c += 13;
                } else {
                    c -= 13;
                }
            } 

            sb.append(c);
        }

        System.out.println(sb);
        in.close();

    }
}
