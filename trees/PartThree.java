import java.util.*;
public class PartThree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;   
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);                        
        root.left = new Node(2);                       
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                  1
                /   \
               2     3
              / \   / \
             4  5  6   7
         */
    }
}