import java.util.*;
public class Assign_1_monotonous {
    public static boolean mono(ArrayList <Integer> l1){
        int f1=0;
        for(int i=1;i<l1.size();i++){
            if(f1==0){
                if(l1.get(i)>l1.get(i-1))
                    f1=1;
                else if(l1.get(i)<l1.get(i-1))
                    f1=2;
            }

            if(f1==1){
                if(l1.get(i-1)>l1.get(i))
                return false;
            }
            
            if(f1==2){
                if(l1.get(i-1)<l1.get(i))
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // ArrayList <Integer> list = new ArrayList(Arrays.asList(1,2,2,3));
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,9,2,3));
        System.out.println(mono(list));
    }
}
