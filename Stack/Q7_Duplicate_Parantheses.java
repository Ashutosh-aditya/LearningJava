import java.util.*;
public class Q7_Duplicate_Parantheses {
    public static boolean isDup(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==')'){ //closing condition
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
        
                }
                if(1>count)
                return true;
                else 
                s.pop();
            }
            else{
                s.push(c);
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)",str1="((a+b))";
        System.out.println(isDup(str));
        System.out.println(isDup(str1));
    }
}
