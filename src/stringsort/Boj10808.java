package stringsort;

import java.util.Scanner;

public class Boj10808 {
    
    public static void main(String[] args) {
        int[] arr = new int[26];
        Scanner in = new Scanner(System.in);
        String str= in.next();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++) {
            arr[str.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
        in.close();
    }
}
