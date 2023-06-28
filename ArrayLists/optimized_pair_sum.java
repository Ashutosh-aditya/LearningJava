import java.util.*;

public class optimized_pair_sum {

    public static boolean OptimizedPairSum(ArrayList<Integer> list,Integer target) {
        Integer begin=0,end=list.size()-1;
        System.out.println("List to be searched : "+list);
        System.out.println("Target : "+target);
        while(begin<end){
            if(list.get(begin)+list.get(end)==target){
                System.out.println(list.get(begin)+" + "+list.get(end)+" = "+target);
                return true;
            }
            else if((list.get(begin)+list.get(end))>target)
                end--;
            else
                begin++;
        }
        return false;
    }
    public static void main(String[] args) {
        //arraylist must be sorted
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        if(OptimizedPairSum(list,5)){
            System.out.println("Pair Found");
        }
        else{
            System.out.println("No Pair Found");
        }
    }
}
