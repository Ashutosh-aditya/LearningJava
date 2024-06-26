import java.util.*;

public class delete_a_node_in_BST {
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
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" - ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" < ");
        inorder(root.right);
    }

    static void postorder(Node root){
        if(root==null || root.data==-1 ){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" - ");
    }


    public static Node insert_Node_in_BST(Node root,int num){
        Node res=new Node(num);
        if(root==null){
            root=res;
        }
        else if(root.data>num){
            root.left=insert_Node_in_BST(root.left, num);
        }
        else {
            root.right=insert_Node_in_BST(root.right, num);
        }
        return root;
    }
    public static Node build_BST(Node root,int arr[]){
        for(int i=0;i<arr.length;i++){
            root=insert_Node_in_BST(root,arr[i]);
        }
        return root;
    }

    public static Node deleteNode(Node root,int data){
        if(root == null){
            return null;
        }
        if(root.data>data){
            root.left=deleteNode(root.left, data);
        }
        else if(root.data<data){
            root.right=deleteNode(root.right, data);
        }
        else {
            if (root.left==null && root.right==null){
                return null;
            }

            else if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }

            else{
                Node temp=root.right;
                while(root.left!=null){
                    temp=temp.left;
                }
                root.data=temp.data;
                root.right=deleteNode(root.right, temp.data);
            }
        }
        return root;
    }
    // public static Node deleteNode(Node root, int data) {
    //     if (root == null) { // Check if the root is null
    //         return null;
    //     }
    
    //     if (root.data > data) {
    //         root.left = deleteNode(root.left, data); // Recursive call for left subtree
    //     } else if (root.data < data) {
    //         root.right = deleteNode(root.right, data); // Recursive call for right subtree
    //     } else {
    //         if (root.left == null) {
    //             return root.right; // Return right subtree if left is null
    //         } else if (root.right == null) {
    //             return root.left; // Return left subtree if right is null
    //         } else {
    //             Node temp = root.right;
    //             while (temp.left != null) { // Use temp to find successor node
    //                 temp = temp.left;
    //             }
    //             root.data = temp.data; // Replace root data with successor data
    //             root.right = deleteNode(root.right, temp.data); // Delete the successor node
    //         }
    //     }
    //     return root; // Return updated root node
    // }

    public static void PrintInRange(Node root,int min ,int max){//not understood
        if(root==null){
            return;
        }
        if( root.data>=min && root.data<=max ){
            PrintInRange(root.left,min,max);
            System.out.print(root.data+" ");
            PrintInRange(root.right,min,max);
            }
        else if(root.data>max){
            PrintInRange(root.left,min,max);
        }
        if(root.data<min){
            PrintInRange(root.right,min,max);
        }
    }

    public static void printpath(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        if(root.left==null && root.right==null){
            printpath(list);
        }
        printRoot2Leaf(root.left, list);
        printRoot2Leaf(root.right, list);
        list.remove(list.size()-1);
    }

    public static boolean validateBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return validateBST(root.left,min,root) && validateBST(root.right,root,max);
    }
    public static void main(String[] args) {
        int arr[]={8, 5, 3, 1, 4, 6, 10, 11, 14},del=6;
        int arr1[]={8, 5, 3, 6, 10, 11, 14};
        int arr2[]={1,1,1};
        Node root1=build_BST(null, arr);
        Node root = build_BST(null, arr1);
        inorder(root);
        // root=deleteNode(root, del);
        System.out.println();
        System.out.println("After deleting node with data :"+del);
        inorder(root);
        System.out.println();
        int min=1,max=5;
        System.out.println("Print in range "+min+" to "+max);
        PrintInRange(root,min,max);
        System.out.println();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Root to leaf");
        printRoot2Leaf(root, al);
        printRoot2Leaf(root1, al);
        Node root2=build_BST(null, arr2);
        if(validateBST(root, null,null)){
            System.out.println("BST is valid");
        }
        else{
            System.out.println("BST is not valid");
        }
        if(validateBST(root2, null,null)){
            System.out.println("BST is valid");
        }
        else{
            System.out.println("BST is not valid");
        }
    }
}
