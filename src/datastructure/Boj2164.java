package datastructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Boj2164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0;i<N;i++) {
            dq.addLast(i+1);
        }

        while(dq.size()>1) {
            dq.pop();
            if(dq.size()==1) break;
            int firstCard = dq.pop();
            dq.addLast(firstCard);
        }

        System.out.println(dq.pop());
        in.close();
    }
}
