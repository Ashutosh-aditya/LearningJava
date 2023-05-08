public class using_String_builder {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("");
        for(char i='a'; i <='z';i++)
        {
            str.append(i); 
            str.append(' ');
        } 
        System.out.println("String = "+str);
    }
}
