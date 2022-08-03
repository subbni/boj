package stringsort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10820 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        char c;
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[4];

        // 대문자 65~90 소문자 97~122 숫자 48~57 공백 32
        while(in.hasNextLine()) {
            str = in.nextLine();
            for(int i=0;i<str.length();i++) {
                c = str.charAt(i);
                
                if (c>=97 && c<=122) {
                    arr[0]++;
                } else if(c>=65 && c<=90) {
                    arr[1]++;
                } else if(c>=48 && c<=57 ) {
                    arr[2]++;
                } else if(c==32) {
                    arr[3]++;
                }

            }

            for(int i=0;i<4;i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            Arrays.fill(arr,0);
        }

        System.out.println(sb);
        in.close();
    }
}
