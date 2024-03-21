public class SumTreeTransform {
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

    public static int transforToSumTree(Node root){
        if(root==null){
            return 0;
        }
        int lsum=transforToSumTree(root.left);
        int rsum=transforToSumTree(root.right);
        int temp=root.data;
        root.data=lsum+rsum;
        return lsum+rsum+temp;
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" - ");
        inorder(root.right);
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
        inorder(root);
        System.out.println();
        transforToSumTree(root);
        inorder(root);
        /*
        Expected sum tree
                  27
                /   \
               9     13
              / \   / \
             0   0 0   0
         */
    }
}
