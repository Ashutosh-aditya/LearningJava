public class substring_simple_code {
    public static void substr(String str , int start, int end)
    {
        for(int i=start;i<end;i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        String str = new String("hello world");
        substr(str, 0, 5);
        System.out.println(str.substring(0, 1));
    }
}
