import java.util.*;
public class Q5_Next_Greater_Element {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ans[]=new int[arr.length];
        NextGreater(arr,ans);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }

    public static void NextGreater(int[] arr, int[] ans) {
        Stack <Integer> s =new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty())
                ans[i]=-1;
            else
                ans[i]=arr[s.peek()];
            s.push(i);
        }
    }
}
