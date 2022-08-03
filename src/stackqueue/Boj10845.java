package stackqueue;

import java.util.Scanner;

public class Boj10845 {
    public static int queue[];
    public static int front=-1;
    public static int rear=-1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        queue= new int[N];
        String str;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            str = in.next();
            switch(str) {
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
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back": 
                    sb.append(back()).append('\n');
            }
        }
        System.out.print(sb);
        in.close();
    }

    static void push(int item) {
        queue[++rear]=item;
    }

    static int pop() {
        if(front==rear) {
            return -1;
        }
        return queue[++front];

    }

    static int size() {
        return Math.abs(rear-front);
    }

    static int empty() {
        if(front==rear) return 1;
        else return 0;
    }

    static int front() {
        if(front==rear) {
            return -1;
        }
        return queue[front+1];
    }

    static int back() {
        if(front==rear) {
            return -1;
        }
        return queue[rear];
    }

}
