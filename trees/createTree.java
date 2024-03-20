
// the below code fragment can be found in:
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class createTree {
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

    static class info{
        int height;
        int diameter;
        info(int h,int d){
            this.height=h;
            this.diameter=d;
        }
    }

    static class binaryTree{
        static int idx=-1;
        static Node buildTree(int arr[]){
            idx++;
            if(arr[idx]==-1)
            return null;
            Node newNode=new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
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

        static void levelorder(Node root){
            if(root==null){
                System.out.println();
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp=q.remove();
                if(temp==null){
                    System.out.println();
                    if(q.isEmpty())
                        break;
                    else 
                        q.add(null);
                }
                else{
                    System.out.print(temp.data+" - ");
                    if(temp.left!=null) q.add(temp.left);   //use temp not root
                    if(temp.right!=null) q.add(temp.right); //use temp not root
                }
            }
        }

        static int height(Node root){
            if(root==null)
            return 0;
            else 
            return Math.max(height(root.left),height(root.right))+1;
        }

        static int diameter2(Node root){ // O(n2) 
            if(root==null)
            return 0;
            else{
                int lh,rh,dm;
                lh=rh=dm=0;
                lh=height(root.left);
                rh=height(root.right);
                dm=lh+rh+1;
                return dm;
            }
        }

        static info diameter(Node root){

            if(root==null)
                return new info(0, 0);

            info lInfo=diameter(root.left);
            info rInfo=diameter(root.right);

            int dia=Math.max((lInfo.height+rInfo.height+1),Math.max(lInfo.diameter, rInfo.diameter));
            int ht=Math.max(lInfo.height,rInfo.height)+1;

            return new info(ht, dia);
        }

        static int countNodes(Node root){
            int s1=0,s2=0;
            if(root==null) return 0;
            if(root.left!=null)s1=countNodes(root.left)+1;
            if(root.right!=null)s2=countNodes(root.right)+1;
            return s1+s2+1;
        }

        static int sumofnodes(Node root){
            if(root==null)
                return 0;
            else{
                int lsum=0,rsum=0;
                lsum=sumofnodes(root.left);
                rsum=sumofnodes(root.right);
                return lsum+rsum+root.data;
            }
        }

        static boolean isIdentical(Node n1,Node subroot){
            if(n1==null && subroot==null){
                return true;
            }
            else if(n1==null || subroot==null || n1.data !=subroot.data){
                return false;
            }

            if(!isIdentical(n1.left, subroot.left)){
                return false;
            }
            else if(!isIdentical(n1.right, subroot.right)){
                return false;
            }
            else return true;
        }

        public static boolean isSubtree(Node root,Node subroot){
            if(root==null)
                return false;
            if(root.data==subroot.data){
                return isIdentical(root,subroot);
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

        static boolean CompareTree(Node r1,Node r2){
            boolean rt=false,lt=false;
            if(r1==null && r2==null) 
            return true;
            else if(r1==null || r2==null){
                return false;
            }
            else{
                if(r1.data==r2.data){
                    lt=CompareTree(r1.left, r2.left);
                    rt=CompareTree(r1.right, r2.right);
                    if(lt && rt){
                        return true;
                    }
                }
                return false;
            }
        }

        static class info2{
            Node n1;
            int hd;
            info2(Node node,int dist){
                this.n1=node;
                this.hd=dist;
            }
        }

        static void topView(Node root){
            Queue<info2> q = new LinkedList<>();
            q.add(new info2(root,0));
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0,max=0;
            q.add(new info2(root,0));
            q.add(null);
            while(!q.isEmpty()){
                info2 curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(!map.containsKey(curr.hd)){//first occurance
                        map.put(curr.hd, curr.n1);
                    }
                    if(curr.n1.left!=null){
                        q.add(new info2(curr.n1.left, curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                        
                    }
                    if(curr.n1.right!=null){
                        q.add(new info2(curr.n1.right, curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                        
                    }
                }
            }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node n1 = createTree.binaryTree.buildTree(arr);
        System.out.println(n1.data);
        System.out.println();
        createTree.binaryTree.preorder(n1);
        System.out.println();
        createTree.binaryTree.inorder(n1);
        System.out.println();
        createTree.binaryTree.postorder(n1);
        System.out.println();
        createTree.binaryTree.levelorder(n1);
        System.out.println("Height is "+createTree.binaryTree.height(n1));
        System.out.println("Number of nodes is "+createTree.binaryTree.countNodes(n1));
        System.out.println("Sum of nodes is "+createTree.binaryTree.sumofnodes(n1));
        System.out.println("Diameter is "+createTree.binaryTree.diameter2(n1));//wrong code 
        info obj1=createTree.binaryTree.diameter(n1);//O(n)
        System.out.println("using efficient approach Diameter is "+obj1.diameter); 
        System.out.println("using efficient approach Height is "+obj1.height); 
        System.out.println("Compare 2 trees result "+createTree.binaryTree.CompareTree(n1, null));

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


        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);
        System.out.println("Compare 2 trees result "+createTree.binaryTree.CompareTree(root, subRoot));
        System.out.println("Is subtrees : "+createTree.binaryTree.isSubtree(root, subRoot));
        createTree.binaryTree.topView(root);
    }
}
