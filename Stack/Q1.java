import java.util.*;
public class Q1 {
    public static void addBottom(int x,Stack <Integer> s){
        if(s.isEmpty())
            {
                s.push(x);
            }
            else
            {
                int item=s.pop();
                addBottom(x, s);
                s.push(item);
            }
            return;
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        for(int i=1;i<5;i++)
            s.push(i);
            System.out.println(s.peek());
            addBottom(5, s);
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
    }
}
