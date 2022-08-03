package graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Node {
    char key;
    Node left;
    Node right;

    public Node(char key) {
        this.key= key;
    }
}

public class Boj1991 {
    static int N;
    static Map<Character,Node> map;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        map = new HashMap<Character,Node>();
        char c;
        Node node, left, right;
        for(int i=0;i<N;i++) {
            c = in.next().charAt(0);
            node = (Node)map.get(c);
            if(node==null) {
                node = new Node(c);
            }

            c = in.next().charAt(0);
            if(c>=65 && c<=90) {
                left = (Node)map.get(c);
                if(left==null) {
                    left = new Node(c);
                    map.put(c,left);
                }
                node.left = left;
            }


            c = in.next().charAt(0);
            if(c>=65 && c<=90) {
                right = (Node)map.get(c);
                if(right==null) {
                    right = new Node(c);
                    map.put(c,right);
                }      
                node.right = right;
            }

              map.put(node.key,node);
        }


        Node root = (Node)map.get('A');
       preorder(root);
        System.out.println();
        inorder(root);
       System.out.println();
        postorder(root);
        in.close();
    }

    static void preorder(Node node) {
        if(node==null) return;
        System.out.print(node.key);
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.key);
        inorder(node.right);
    }

    static void postorder(Node node) {
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key);
    }
}
