package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Boj3986 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int N = in.nextInt();
        int cnt = 0;

        in.nextLine();
        for(int i=0;i<N;i++) {
            StringBuffer sb = new StringBuffer(in.nextLine());
            for(int idx=0;idx<sb.length();idx++) {
                char c = sb.charAt(idx);
                if(stack.isEmpty()) stack.push(c); 
                else if(stack.peek()==c) stack.pop();
                else stack.push(c);
            }
            if(stack.isEmpty()) cnt++;
            stack.clear();
        }

        System.out.println(cnt);
        in.close();
    }
}
