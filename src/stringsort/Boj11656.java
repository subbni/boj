package stringsort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11656 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] arr = new String[str.length()];

        for(int i=0;i<str.length();i++) {
            arr[i] = str.substring(i);
        }

        Arrays.sort(arr);
        for(int i=0;i<str.length();i++) {
            System.out.println(arr[i]);
        }

        in.close();
    }
}
