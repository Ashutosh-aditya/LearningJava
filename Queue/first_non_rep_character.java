import java.util.*;
import java.util.LinkedList;
public class first_non_rep_character {
    public static void main(String[] args) {
        Queue<Character> q1 = new LinkedList<>();
        int[] freq = new int[26];
        for(int i=0; i<26; i++)
            freq[i]=0;
        String str="aabccxb";
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            q1.add(c);
            freq[c-'a']++;
            while(q1.isEmpty()==false && freq[q1.peek()-'a']!=1 ){
                q1.remove();
            }
            if(q1.isEmpty())
            System.out.println("-1");
            else
            System.out.println(q1.peek());
        }
        // System.out.println(q1.toString());
    }

    // public static void main(String[] args) {
    //     Queue<Character> q1 = new LinkedList<>();
    //     int[] freq = new int[26];
    //     for(int i=0; i<26; i++)
    //         freq[i]=0;
    //     String str="aabccxb";
    //     for(int i=0; i<str.length(); i++){
    //         char c=str.charAt(i);
    //         freq[c-'a']++;
    //         if(freq[c-'a']==1)
    //             {
    //                 q1.add(c);
    //                 System.out.println(q1.peek());
    //             }else if(freq[q1.peek()-'a']>1)
    //             {
    //                 // System.out.println("--"+q1.toString());
    //                 q1.remove();
    //                 // System.out.println("-"+q1.toString());
    //                 System.out.println("-1");
    //             }
    //     }
    //     System.out.println(q1.toString());
    // }
}
