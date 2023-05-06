public class first_letter_uppercase
{
    public static void main(String[] args) {
        String str ="the quick brown fox jumped over the lazy dog";
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++)
        {
            if((str.charAt(i-1))==' ')
            {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                sb.append(str.charAt(i));
        }
        System.out.println(str);
        System.out.println(sb);
    }
}