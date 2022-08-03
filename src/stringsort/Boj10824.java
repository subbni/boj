package stringsort;

import java.util.Scanner;

public class Boj10824 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ab = in.next()+in.next();
        String cd = in.next()+in.next();
 
        long first = Long.parseLong(ab);
        long second = Long.parseLong(cd);
    
        System.out.println(first+second);
        in.close();
    }
}
