package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Boj4949 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuffer sb;
        StringBuffer result = new StringBuffer("");
    
        while(true) {
            sb = new StringBuffer(in.nextLine());
            if(sb.toString().equals(".")) break; 
        

            for(int i=0;i<sb.length();i++) {
                char c = sb.charAt(i);
                if(c=='[' || c=='(') {
                    stack.push(c);
                } else if(c==']' || c==')') {
                    if(stack.isEmpty()) {
                        stack.push(c); break;
                    } else {
                        if(c-stack.peek()==1 || c-stack.peek()==2) stack.pop();
                        else break;
                    }
                }
            }
            if(stack.isEmpty()) result.append("yes").append("\n");
            else result.append("no").append("\n");
            stack.clear();
        }

        System.out.println(result);
        in.close();
    }
}
