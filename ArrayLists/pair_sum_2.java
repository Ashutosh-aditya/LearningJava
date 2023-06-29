import java.util.*;
//Shifted rotated arraylist
public class pair_sum_2 {

    public static boolean PairSum(ArrayList<Integer>list,Integer target) {
        Integer begin=0,end=list.size()-1,shiftpt;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                shiftpt=i;
                end=i;
                begin=i+1;
            }                
        }
        while(begin!=end){
            System.out.println("begin:"+begin+"\tend:"+end);
            if(list.get(begin)+list.get(end)==target){
                System.out.println(list.get(begin)+" + "+list.get(end)+" = "+target);
                return true;
            }
            else if((list.get(begin)+list.get(end))>target){
                end--;
                if(end<0)
                    end=list.size()-1;
            }
            else{
                begin++;
                if(begin==list.size())
                    begin=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,7,8,9,10,1,2,3,4,5));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        System.out.println(PairSum(list, 12));
        System.out.println(PairSum(list1, 16));
    }
}
