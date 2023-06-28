import java.util.ArrayList;

public class basic_fns {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<11;i++){
            list1.add(i);
        }
        System.out.println(list1);
        list1.set(10, 30);
        System.out.println(list1);

        // list1.set(11, 40); //error 
        // System.out.println(list1);

        list1.add(11, 40);
        System.out.println(list1);
        
        list1.remove(10);
        System.out.println(list1);
        System.out.println(list1.get(10));
        System.out.println(list1.contains(30));
        System.out.println(list1.contains(40));
    }
}
