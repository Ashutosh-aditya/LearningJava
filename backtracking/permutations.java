public class permutations {
    public static void findPermutations(String str, String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            // char cc=str.charAt(i);
            String cc=""+str.charAt(i);
            // ans=ans+str.charAt(i); //error
            System.out.println("i->"+i+"\t str[i]->"+str.charAt(i)+"\t str->"+str+" \t ans="+ans+"   \t cc-> "+cc);
            String res= str.substring(0, i)+str.substring(i+1);
            findPermutations(res, ans+cc);
            // findPermutations(res, ans);
        }
    }
    public static void main(String[] args) {
        String s1="abc";
        findPermutations(s1, "");
    }
}
