public class remove_Duplicates {
    public static void rd(String str,int idx,StringBuilder newStr,boolean map[]) {
        if(idx==str.length())
            {
                System.out.println(newStr);
                // return; //if the next condition is not connected by else if thenmust not forget to add return even if function is of void type 
            }
        else if(map[str.charAt(idx)-'a']==true)
            {
                rd(str, idx+1, newStr, map);
            }
        else
            {
                map[str.charAt(idx)-'a']=true;
                rd(str, idx+1, newStr.append(str.charAt(idx)), map);
            }
    }
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        boolean map[]=new boolean[26];
        int idx=0;
        rd("aaaabbbbbbbbbccccccccdefgggggggg",idx,sb,map);
    }
    
}
