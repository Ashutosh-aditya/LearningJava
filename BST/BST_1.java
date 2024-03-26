

public class BST_1 {
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
        System.out.print(root.data+" - ");
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

    public static boolean search_BST(Node root,int num){ //TC->O(H)
        if(root==null){
            System.out.println("Match not found for "+num);
            return false;
        }
        if(root.data==num){
            System.out.println("Match found for "+num);
            return true;
        }
        if(root.data>num){
            return search_BST(root.left, num);
        }
        else{
            return search_BST(root.right, num);
        }
    }

    public static void main(String[] args) {
        int arr[]={55,1,3,4,2,7,9,56};
        Node root =null;
        root=build_BST(root, arr);
        inorder(root);
        System.out.println();
        System.out.println(search_BST(root, 5));
        //remember this pattern for boolean fns
        if(search_BST(root,20)){
            System.out.println("search found the result");
        }
        else{
            System.out.println("search did not find the result");            
        }
    }
}
