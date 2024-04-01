import java.util.ArrayList;

public class Merge_2_BST {
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
    public static void getInorder(Node root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
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

    public static ArrayList<Integer> Combine_2_Sorted_ArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                result.add(list1.get(i));
                i++;
            }
            else{
                result.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
    public static void main(String[] args) { //O(m+n) -> Linear
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        getInorder(root1, list1);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        getInorder(root2, list2);

        ArrayList<Integer> list = Combine_2_Sorted_ArrayLists(list1, list2);
        int ar[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ar[i]=list.get(i);
        }

        Node root = createBalancedBST(ar, 0, list.size()-1);
        inorder(root);
        System.out.println();
        preorder(root);
    }
}
