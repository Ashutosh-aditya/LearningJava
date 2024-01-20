import java.util.*;
import java.util.LinkedList;
public class reverse_a_queue {
    public static void rev(Queue<Integer> q1){
        Stack<Integer> s1=new Stack<>();
        while(!q1.isEmpty()){
            s1.push(q1.remove());
        }
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
        int size = 10;
        for(int i=0;i<size;i++)
            q1.add(i+1);
        System.out.println(q1.toString());
        rev(q1);
        System.out.println(q1.toString());

    }
}
