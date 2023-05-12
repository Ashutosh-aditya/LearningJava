public class Binary_strings_non_consecutive_ones {

    public static void binaryStr(int n,int lastidx,String str) {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binaryStr(n-1,0, str+"0");
        if(lastidx==0)
        binaryStr(n-1,1, str+"1");
    }

    public static void main(String[] args) {
        String str =new String();
        binaryStr(5, 0,str);
    }
}
