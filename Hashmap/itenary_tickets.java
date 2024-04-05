import java.util.*;
public class itenary_tickets {
    // public static String getStart(HashMap<String, String> tickets){ // my approach
    //     HashSet<String> s1 = new HashSet<>(tickets.keySet());
    //     HashSet<String> s2 = new HashSet<String>();
    //     for(String key : tickets.keySet()){
    //         s2.add(tickets.get(key));
    //     }
    //     System.out.println(s1.removeAll(s2)+" : "+s1);
    //     String str="";
    //     for(String s : s1){
    //         str=s;
    //     }
    //     return str;
    // }

    public static String getStart(HashMap<String, String> tickets){ // correct/Official approach
        HashMap<String, String> rev = new HashMap<String, String>();
        for(String key : tickets.keySet()){
            rev.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<String, String>();
        tickets.put("Chennai", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        // System.out.println(getStart(tickets));
        String start = getStart(tickets);
        // System.out.println(start);
        String it=start;
        // while(it!=null){
        //     System.out.print(it+" -> ");
        //     it=tickets.get(it);
        // }

        System.out.print(start);
        for(String itr : tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
