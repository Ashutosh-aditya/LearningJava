import java.util.*;
import java.util.LinkedList;
public class using_jcf {
    public static void main(String[] args) {
        Queue<Integer>q1=new LinkedList<>();
        for(int i=0;i<10;i++)
            q1.add(i);
        String s=q1.toString();
        System.out.println(s);
    }
}
