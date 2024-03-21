public class kth_ancestor_of_a_node {
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

    public static int KthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        
        }
        int lDist=KthAncestor(root.left, n, k);
        int rDist=KthAncestor(root.right, n, k);

        if(lDist==-1 && rDist==-1){
            return -1;
        }

        int max=Math.max(lDist, rDist);

        if(max+1==k){
            System.out.println(k+" <- Ancestor of "+n+" is -> "+root.data);
        }
        return max+1; 
        
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
        KthAncestor(root, 4, 2);
    }
}
