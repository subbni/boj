package basicmath;

import java.util.Scanner;

// 10진수를 B진법으로 변환
public class Boj11005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long decimal = in.nextLong();
        int B = in.nextInt();
        int rest= 0;
        StringBuffer sb = new StringBuffer();

        while(decimal>0) {
            rest = (int)decimal%B;
            sb.append(transfer(rest));            
            decimal = decimal/B;
            
        }

        System.out.print(sb.reverse());

        in.close();
    }

    public static char transfer(int num) {
        if(num>=10) {
            return (char)(num+55);
        } else {
            return (char)(num+48);
        }

        
    }
}
