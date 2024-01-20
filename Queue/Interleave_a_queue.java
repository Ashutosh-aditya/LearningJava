import java.util.*;
import java.util.LinkedList;
public class Interleave_a_queue {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        int size = 10;
        for(int i=0;i<size;i++)
            q1.add(i+1);
        System.out.println(q1.toString());
        for(int i=0;i<(size/2);i++){
            q2.add(q1.remove());
        }
        System.out.println(q2.toString());
        for(int i=0;i<size/2;i++){
            int temp = q2.remove();
            q1.add(temp);
            temp = q1.remove();
            q1.add(temp);
        }
        System.out.println(q1.toString());
    }
}
