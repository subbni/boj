package stackqueue;

import java.util.Scanner;

public class Boj10799 {
    public static int[] stack= new int[1000000];
    public static int top=-1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        int index=0;
        int result=0;
        char c;

        while(index<str.length()) {
            c=str.charAt(index);

            switch(c) {
                case '(':
                  if(str.charAt(index+1)==')') {
                       index++;
                       set();
                   } else {
                         push(1);
                   }
                break;
                case ')':
                    result += pop();
                break;
            }
            index+=1;
        }
        System.out.println(result);
        in.close();
    }

    static void push(int item) {
        stack[++top] = item;
    }

    static int pop() {
        if(top==-1) return -1;
        else return stack[top--];
    }

    static void set() {
        if(top==-1) {
            return;
        }

        for(int i=0;i<=top;i++) {
            stack[i]=stack[i]+1;
        }
    }
}
