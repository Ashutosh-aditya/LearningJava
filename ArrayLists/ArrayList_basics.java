import java.util.*;
public class ArrayList_basics {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=0;i<11;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
    }
}
