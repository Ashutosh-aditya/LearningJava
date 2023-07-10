import java.util.*;
public class lonely_nums {

    public static void lonelyNum(ArrayList <Integer> list){
        Collections.sort(list);
        ArrayList <Integer> lonelyList=new ArrayList<Integer>();

        for(int i=0;i<list.size();i++){

            int a,b=list.get(i),c;
            if(i==0){
                c=list.get(i+1);
                if(b!=(c+1))
                    lonelyList.add(b);
            }
            else if(i==list.size()-1){
                a=list.get(i-1);
                if(b!=(a-1))
                    lonelyList.add(b);
            }
            else{
                a=list.get(i-1);
                c=list.get(i+1);
                if(b!=(a-1) && b!=(c+1))
                    lonelyList.add(b);
            }
        }
        if(lonelyList.size()>0)
        {
            System.out.println(lonelyList);
        }
        else
        {
            System.out.println("No nums are Lonely");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,8));
        lonelyNum(list);
    }
}
