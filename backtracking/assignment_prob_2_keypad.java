public class assignment_prob_2_keypad {
    public static String AssigStr(int n1) {
        String s1=new String();
        if(n1==2){s1="abc";}        
        else if(n1==3){s1="def";}
        else if(n1==4){s1="ghi";}
        else if(n1==5){s1="jkl";}
        else if(n1==6){s1="mno";}
        else if(n1==7){s1="pqrs";}
        else if(n1==8){s1="tuv";}
        else if(n1==9){s1="wxyz";}
        else s1=" ";
        return s1;
    }
    public static void permute(String str1,String str2,String ans,int len) {
        if(ans.length()==len) {
            System.out.print(" "+ans+" ");
            return;
        }
        for(int i=0;i<str1.length();i++){
            char c= str1.charAt(i);
            // String s=new String(ans);
            // if(c=='b')
            // {
            //     System.out.println("str1="+str1+"\nstr2="+str2+"\nans="+ans);
            // }
            // str1=str1.substring(0, i)+str1.substring(i+1);
            permute(str2, str1, ans+c, len);
            // ans=s;
        }
    }
    public static void main(String[] args) {
        int n1=7,n2=1;
        String s1,s2;
        s1=AssigStr(n1);
        s2=AssigStr(n2);
        // System.out.println(s1+"------"+s2);
        permute(s1, s2, "", 2);
    }
}
