import java.util.ArrayList;

public class MirrorBST {
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

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" < ");
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" - ");
        preorder(root.left);
        preorder(root.right);
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

    public static Node Mirror_BST(Node root){//O(n)
        if(root==null){
            return null;
        }
        Node t1=root.left;
        root.left=root.right;
        root.right=t1;
        Mirror_BST(root.left);
        Mirror_BST(root.right);
        return root;
    }

    public static Node createBalancedBST(int arr[],int start,int end){ //O(n)
        if(arr.length == 0 || start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBalancedBST(arr,start,mid-1);
        root.right=createBalancedBST(arr,mid+1,end);
        return root;
    }

    public static void getInorder(Node root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    public static Node ConvertToBalancedBST(Node root){ //O(n)
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root, list);
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return createBalancedBST(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[]={8, 5, 10, 3,6,11};
        Node root=build_BST(null, arr);
        preorder(root);
        System.out.println();
        Node m1=Mirror_BST(root);
        preorder(m1);
        System.out.println();
        int arr1[]={3,5,6,8,10,11,12};
        Node root1=createBalancedBST(arr1, 0, arr1.length-1);
        System.out.println("Balanced BST");
        preorder(root1);

        //convert to balenced bst
        Node r=new Node(8);
        r.left=new Node(6);
        r.left.left=new Node(5);
        r.left.left.left=new Node(3);

        r.right=new Node(10);
        r.right.right=new Node(11);
        r.right.right.right=new Node(12);

        System.out.println("\nBefore conversion");
        preorder(r);
        System.out.println();
        System.out.println("After conversion");
        Node r1=ConvertToBalancedBST(r);
        preorder(r1);
    }
}
