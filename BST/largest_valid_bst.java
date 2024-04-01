public class largest_valid_bst { //hard must revise
    
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

    static class Info{
        boolean isValidBST;
        int size;
        int min;
        int max;
        Info(boolean isValidBST, int size, int min, int max){
            this.isValidBST=isValidBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxBST = 0;
    public static Info isLargestBST(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE );
        }
        Info leftInfo=isLargestBST(root.left);
        Info rightInfo=isLargestBST(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        // int min=Math.min(leftInfo.min,Math.min(rightInfo.min,root.data));
        // int max=Math.max(leftInfo.max,Math.max(rightInfo.max,root.data));
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isValidBST && rightInfo.isValidBST){
            maxBST=Math.max(maxBST,size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }
    
    
    public static void main(String[] args) {
        /*

         50
       /    \
     30      60
    /  \    /   \
   5    20 45    70
                /  \
               65   80
    expected BST size is 5 ;
         */
        Node root=new Node(50);
        
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        isLargestBST(root);
        System.out.println("Size of Largest Valid BST is : "+maxBST);

    }
}
