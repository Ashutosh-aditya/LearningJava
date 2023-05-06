public class String_compression {
    public static String compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        int count;
        for(int i=0;i<str.length();i++)
        {
            count=1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) // first check out of bound condition then check other conditions
            //while( str.charAt(i)==str.charAt(i+1) && i<str.length()-1) //THIS WILL THROW AN ERROR 
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
                sb.append(count);

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String cmp="aaabbbbccccc";
        String cmp1="mississippi";
        System.out.println(compress(cmp));
        System.out.println(compress(cmp1));
    }
}
