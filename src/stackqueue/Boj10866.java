package stackqueue;

import java.util.Scanner;

public class Boj10866 {
    public static int deque[];
    public static int front=0;
    public static int rear=0;
    public static int size=0;
    public static int capacity=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = capacity = in.nextInt();
        deque= new int[capacity];

        StringBuilder sb = new StringBuilder();
        String str;

        for(int i=0; i<N;i++) {
            str = in.next();
            
            switch(str) {
                case "push_front":
                    push_front(in.nextInt());
                    break;
                case "push_back":
                    push_back(in.nextInt());
                    break;
                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;
                case "pop_back":
                    sb.append(pop_back()).append('\n');
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
        System.out.println(sb);
        in.close();
    }

    public static void push_front(int item) {       
        deque[front] = item;
        front = (front-1+capacity)%capacity;
        size++;
    }

    public static void push_back(int item) {
        rear =  (rear+1)%capacity;
        deque[rear] = item;
        size++;
    }

    public static int pop_front() {
        if(front == rear) {
            return -1;
        }

        size--;
        front = (front+1)%capacity;
        return deque[front];
    }

    public static int pop_back() {
        if(front==rear) {
            return -1;
        }
        int ans = deque[rear];
        rear = (rear-1+capacity)%capacity;
        size--;
        return ans;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size==0) return 1;
        else return 0;
    }

    public static int front() {
        if(size==0) return -1;
        return deque[(front+1)%capacity];
    }

    public static int back() {
        if(size==0) return -1;
        return deque[rear];
    }

}
