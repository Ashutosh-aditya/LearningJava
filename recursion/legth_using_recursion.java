public class legth_using_recursion {

    public static void strlenth(String str,int idx) {
        if(idx==str.length())
        {
            System.out.println(idx);
            return;
        }
        else
            strlenth(str, idx+1);
    }
    public static void main(String[] args) {
        String str="Hello";
        strlenth(str, 0);
    }
}
