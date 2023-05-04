public class lexographical_comparision {
    public static String largest(String str[]) {
        String result=str[0];
        for(int i=1; i<str.length; i++)
        {
            if((str[i].compareTo(result))>0) //here comparing array element to the result
                result=str[i];
        }
        return result;        
    }
    public static void main(String[] args) {
        String str1[]={"apple", "orange", "banana","pineapple", "guava"};
        System.out.println(largest(str1));
    }
}
