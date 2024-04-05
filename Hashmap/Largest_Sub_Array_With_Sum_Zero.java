import java.util.*;
public class Largest_Sub_Array_With_Sum_Zero {
    public static void main(String[] args) { // O(n) time Complexity used presum approach
        /*
         * in preSum approach to calculate sum from i to j
         * we first calculate sum from 0 to i 
         * then calculate sum from o to j (just continue previous loop so we get sum array in O(n) time Complexity)
         */
        int arr[]={15,-2,2,-8,1,7,10,23};
        /*
         *hashmap has <sum,idx> format
         */
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0,diff=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            // System.out.println("Sum = " +sum+" idx = "+i);
            if(map.containsKey(sum)){
                diff=Math.max(diff,i-map.get(sum));
                // System.out.println("----------------Diff = " +diff+" idx = "+i);
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println("Max diff is : " + diff);
    }
}

