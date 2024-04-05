import java.util.*;
public class Union_and_Intersection { //O(m+n)
    public static void main(String[] args) {
        // int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12};
        // int arr2[]={2,4,6,8,10,12,14,16,18,20};
    
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){ //union
            s1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(s1.contains(arr2[i])){ // check intersection between arrays
                s2.add(arr2[i]);
            }
            s1.add(arr2[i]);
        }
        HashSet<Integer> s3 = new HashSet<>(s1);

        System.out.println("Intersection of set : "+s2.size()+" "+s2);
        System.out.println("Union of set : "+s1.size()+" "+s1);
        System.out.println("Difference of set : "+s1.removeAll(s2)+" : union-intersection : "+s1);
        System.out.println("Original set of union : "+s3);
    }
}
