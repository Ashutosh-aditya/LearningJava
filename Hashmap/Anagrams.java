import java.util.*;
public class Anagrams {
    public static boolean isAnagram(String s, String t) { //O(n)
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> sh = new HashMap<Character,Integer>();
        // HashMap<Character,Integer> th = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            char c =s.charAt(i);
            if(sh.containsKey(c)){
                sh.put(c, sh.get(c)+1);
            }
            else{
                sh.put(c, 1);
            }
        }
        System.out.println("c1"+sh);
        for(int i = 0; i < t.length(); i++){
            char c =t.charAt(i);
            System.out.println("c2"+sh);
            if(sh.containsKey(c)){
                int temp=sh.get(c);
                if(temp<=0){
                    // System.out.println("f1");
                    return false;
                }
                else{
                    sh.put(c, temp-1);
                }
            }
            else{
                // System.out.println("f2");
                return false;
            }
            // System.out.println("c3"+sh);

        }
        for(int i=0;i<sh.size();i++){
            if(sh.get(i)!=null){
                // System.out.println("f3");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="care",s2="racer";
        if(isAnagram(s1, s2)){
            System.out.println("It's an anagram");
        }
        else{
            System.out.println("It's not an anagram");
        }
    }
}
