import java.util.*;
public class Sliding_Window_Using_PQ {
    public static void main(String[] args) {
        try{
            int arr[]={1,3,-1,-3,5,3,6,7};
        int windowSize=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()==windowSize){
                int tmp=pq.peek();
                ans.add(tmp);
                pq.remove(arr[i-windowSize+1]);
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        }
        catch(Exception e){
            System.out.println("Error Occoured -> "+e);
        }
    }
}
