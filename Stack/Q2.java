import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        //reverse a string
        Stack <Character> s = new Stack<>();
        String str="abc",ans="";
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        while(!s.isEmpty()){
            ans=ans+s.pop();
        }
        System.out.println(ans);
    }
}