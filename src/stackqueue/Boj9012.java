package stackqueue;
import java.util.Scanner;

public class Boj9012 {
    public static char stack[]=new char[50];
    public static int top=-1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str;
        char c;
        boolean isVps=true;

        for(int i=0;i<n;i++) {
            str = in.next();

            for(int s=0;s<str.length();s++){
                if(!isVps) {
                    break;
                }
                c = str.charAt(s);
                switch(c) {
                    case '(':
                        push(c);
                        break;
                    case ')':
                        if(pop()==0) {
                            isVps = false;
                        }
                        break;
                }
            }
            if(isVps==false || isEmpty()==false) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            clear();
            isVps=true;
        }
       
        in.close();
        
    }

    static void push(char c) {
        stack[++top] = c;
    }

    static char pop() {
        if(top==-1) {
            return 0;
        }
            return stack[top--];   
    }

    static boolean isEmpty() {
        if(top==-1) {
            return true;
        } else return false;
    }
    static void clear() {
        stack=new char[50];
        top = -1;

    }

}
