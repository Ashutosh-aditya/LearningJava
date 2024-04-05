import java.util.*;
public class sum__freq {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10},k=-10;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //(sum,count)
        map.put(0, 1);
        int sum=0,ans=0;

        for(int j=0;j<arr.length;j++){ // O(n)
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
