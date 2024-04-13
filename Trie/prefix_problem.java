public class prefix_problem {
    static class Node{
        Node children[] = new Node[26];
        Boolean endOfWord;
        int freq;
        Node(){
            for(int i=0;i<26;i++){
                this.children[i]=null;
                this.freq=0;
            }
            endOfWord=false;
        }
    }

    static Node root=new Node();
    public static void insert(String str) { //O(L)  length of word
        Node curr=root;
        for(int level=0;level<str.length();level++){
            int idx=str.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr.children[idx].freq++;
            curr=curr.children[idx];
        }
        curr.endOfWord=true;
    }

    public static String searchAbbr(String str){
        Node cur=root;
        String ans="";
        for(int level=0;level<str.length();level++){
            int idx=str.charAt(level)-'a';
            // System.out.println(idx);
            if(cur.children[idx]==null){
                return "word dosen't exist";
            }
            ans=ans+str.charAt(level);
            if(cur.children[idx].freq==1){
                return ans;
            }
            cur=cur.children[idx];
        }
        return "No unique abbreviation found";
    }
    public static void main(String[] args) {
        String str[]={"zebra","dog","duck","dove"};
        for(String s : str) {
            insert(s);
        }
        for(String s : str) {
            System.out.println(searchAbbr(s));
        }
        // System.out.println(searchAbbr("zebra"));
    }
}
