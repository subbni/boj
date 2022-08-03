package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj2331 {
    static ArrayList<Long> list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        int P = in.nextInt();

        list = new ArrayList<Long>();
        StringBuffer pos = new StringBuffer(A);

        long sum= Long.valueOf(A);
        list.add(sum);
        
        while(true) {
            sum=0;
            for(int i=0;i<pos.length();i++) {
                sum+=Math.pow(pos.charAt(i)-48, P);   
            }

            if(list.contains(sum)) {
                break;
            } else {
                list.add(sum);
                pos.delete(0,pos.length());
                pos.append(sum);
            }

            
        }

        System.out.println(list.indexOf(sum));
        in.close();
    }
}
