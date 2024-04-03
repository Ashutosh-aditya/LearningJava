import java.util.*;
public class HashMap_jfc{
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("India", 100); //put -> O(1)
        hm.put("China", 200);
        hm.put("USA", 300);
        hm.put("Russia", 400);
        hm.put("Japan", 500);

        System.out.println("hm.get(\"India\") -> "+hm.get("India")); // get -> O(1)
        System.out.println("hm.get(\"Bhutan\") -> "+hm.get("Bhutan")); // get -> O(1)

        System.out.println("hm.containsKey(\"India\") -> "+hm.containsKey("India")); // O(1)
        System.out.println("hm.containsKey(\"Bhutan\") -> "+hm.containsKey("Bhutan")); // get -> O(1)

        System.out.println("hm.remove(\"China\") -> "+hm.remove("China")); // O(1)
        System.out.println("hm.remove(\"Bhutan\") -> "+hm.remove("Bhutan")); // get -> O(1)

        System.out.println("hm.size() -> "+hm.size()); // get -> O(1)

        Set<String> keys= hm.keySet();

        for(String k : keys){
            System.out.println("key: '"+k+"' has hashmapvalue: "+hm.get(k));
        }

        System.out.println("Hashmap");
        System.out.println(hm);
        //Linked Hash Map maintains input order, internally uses doubly linked lists
        LinkedHashMap<String,Integer> lhm =new LinkedHashMap<>();
        lhm.put("India", 100); //put -> O(1)
        // lhm.put("China", 200);
        lhm.put("USA", 300);
        lhm.put("Russia", 400);
        lhm.put("Japan", 500);
        System.out.println("LinkedHashmap");
        System.out.println(lhm);

        //Tree hashmap provides sorted data (Key based) as it uses red black tree, O(logn)
        TreeMap<String,Integer>tm =new TreeMap<>();
        tm.put("India", 100); //put -> O(1)
        tm.put("USA", 300);
        tm.put("Russia", 400);
        tm.put("Japan", 500);
        System.out.println("TreeHashMap");
        System.out.println(tm);

    }
}