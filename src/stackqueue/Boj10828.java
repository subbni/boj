package stackqueue;

import java.util.Scanner;


public class Boj10828 {
    static int[] stack;
    static int top=-1;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = in.nextInt();
        stack = new int[n];

        
        for(int i=0;i<n;i++) {

            String s = in.next();
 
            switch(s) {
                case "push":
                    push(in.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
            
        }
       System.out.println(sb);
        in.close();
    }

    static void push(int item) {
        stack[++top] = item;
    }

    static int pop() {
        if(top==-1) {
            return -1;
        }
        return stack[top--];
    }
    static int size() {
        return top+1;
    }
    static int empty() {
        if(top==-1) {
            return 1;
        } else {
            return 0;
        }
    }
    static int top() {
        if(top==-1) {
            return -1;
        }
        return stack[top];
    }
}
