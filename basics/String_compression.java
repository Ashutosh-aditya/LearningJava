public class String_compression {
    public static String compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        int count;
        for(int i=0;i<str.length();i++)
        {
            count=1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) // first check out of bound condition then check other conditions
            {
                count++;
                i++;
            }
            if(count>1)
            {
                sb.append(str.charAt(i));
                sb.append(count);
            }
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String cmp="aaabbbbccccc";
        System.out.println(compress(cmp));
    }
}
