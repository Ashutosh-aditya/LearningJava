
// the below code fragment can be found in:
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
    }
}
