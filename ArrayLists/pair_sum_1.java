import java.util.*;
public class pair_sum_1 {

    public static boolean pairSum(Integer target,ArrayList<Integer>list) {
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println(list.get(i)+" + "+list.get(j)+" = "+target);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        if(pairSum(5,list)){
            System.out.println("Pair Found");
        }
        else{
            System.out.println("No Pair Found");
        }
    }
}
