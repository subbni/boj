package basicmath;

import java.math.BigInteger;
import java.util.Scanner;

// 2진수를 8진수로 변환
public class Boj1373 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      StringBuffer binary = new StringBuffer(in.next());
      
      in.close();
    }

    public static void UsingBigInteger() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        BigInteger b = new BigInteger(s,2);
        String result = b.toString(8);
        System.out.println(result);
  
        in.close();
    }
}
