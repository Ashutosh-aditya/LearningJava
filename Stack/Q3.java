import java.util.*;
public class Q3 {
    public static void addBottom(int x,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int item=s.pop();
        addBottom(x, s);
        s.push(item);
        return;
    }
    
    public static void disp(Stack <Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void revStack(Stack<Integer> s){
        if(s.isEmpty())
        return;
        else {
            int item=s.pop();
            revStack(s);
            // s.push(item);
            addBottom(item, s);
        }

    }
    public static void main(String[] args) {
        //reverse a stack
        Stack<Integer> s = new Stack<Integer>();
        for(int i=1;i<11;i++){
            s.push(i);
        }
        // disp(s);
        revStack(s);
        disp(s);
    }
}
