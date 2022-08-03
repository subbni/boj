package stringsort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10809 {
    public static void main(String[] args) {
        int[] arr = new int[26];
        Arrays.fill(arr,-1);

        Scanner in = new Scanner(System.in);
        String str= in.next();
        StringBuilder sb = new StringBuilder();
        int n;

        for(int i=0;i<str.length();i++) {
            n = str.charAt(i)-97;
            if(arr[n]==-1) {
                arr[n]=i;
            } 
        }

        for(int i=0;i<26;i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
        in.close();
    }
}
