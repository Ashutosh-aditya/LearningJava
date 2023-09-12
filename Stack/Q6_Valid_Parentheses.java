import java.util.*;
public class Q6_Valid_Parentheses {
    public static boolean isValid(String str){
        Stack <Character> s =new Stack<>();
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(c=='(' ||  c=='{' || c=='[' ){
                s.push(c);
            }
            else {
                if(s.isEmpty())
                    return false;
                else if((c=='}' && s.peek()=='{') || (c==']' && s.peek()=='[') || (c==')' && s.peek()=='(')){
                    s.pop();
                }
            }
        }
        if(s.isEmpty())
        return true;
        else 
        return false;
    }
    public static void main(String[] args) {
        String str="({})[]";
        if(isValid(str)){
            System.out.println("Valid Parentheses");
        }
        else{
            System.out.println("Invalid Parentheses");
        }
    }
}
