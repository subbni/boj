package etc;

import java.util.Scanner;


class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
    }

    Node(String value, Node left, Node right) {
        this(value);
        this.left= left;
        this.right= right;
    }
}

class DoublyLinkedList {
    Node head;
    int length;

    public void setHead(Node head) {
        this.head = head;
        length++;
    }

    public void delete(Node target) {
        if(target==null) return;
        if(target==head) {
            head = target.right;
        }
        target.left.right = target.right;
        target.right.left = target.left;
        length--;
    }

    public void addLeft(Node target, Node newNode) {
        if(target == null) {
            target = head;
        }
        // target의 왼쪽에 newNode 삽입
        target.left.right = newNode;
        newNode.left = target.left;
        newNode.right = target;
        target.left = newNode;
        length++;
    }

    public void add (Node target) {
        if(length==1) {
            head.left = target;
            head.right = target;
            target.left = head;
            target.right = head;
        } else {
        head.left.right = target;
        target.left = head.left;
        target.right = head;
        head.left = target;
    }
        length++;
    }

    public int getLength() {
        return length;
    }
}

public class Boj1406 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = in.nextInt();
        String command;
        Node cursor;
        
        Node node= new Node(String.valueOf(str.charAt(0)));

        DoublyLinkedList list = new DoublyLinkedList();
        list.setHead(node);

        for(int i=1;i<str.length();i++) {
            node = new Node(String.valueOf(str.charAt(i)));
            list.add(node);
        }

        cursor = list.head.left;

        for(int i=0;i<n;i++) {
            command = in.next();
            switch(command) {
                case "L": 
                    if(cursor == list.head) {
                        cursor = null;
                    } 
                    cursor = cursor.left;
                    break;
                case "D": 
                    if(cursor!= list.head.left) {
                        cursor = cursor.right;
                     } else if (cursor == null) {
                        cursor = list.head;
                     }
                    break;
                case "B": 
                     list.delete(cursor);
                     break;
                case "P":
                     list.addLeft(cursor, new Node(in.next()));
                     break;   
             }
        }

        cursor = list.head;

        for(int i=0;i<list.getLength();i++) {
            System.out.print(cursor.value);
            cursor = cursor.right;
        }

        in.close();

    }
}
