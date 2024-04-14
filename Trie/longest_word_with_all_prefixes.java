public class longest_word_with_all_prefixes {
        static class Node{
            Node children[] = new Node[26];
            Boolean endOfWord;
            Node(){
                for(int i=0;i<26;i++){
                    this.children[i]=null;
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
                    curr=curr.children[idx];
                }
                curr.endOfWord=true;
            }
    
            public static boolean search(String str) { //O(L)  length of word
                Node curr=root;
                for(int level=0;level<str.length();level++){
                    int idx=str.charAt(level)-'a';
                    if(curr.children[idx]==null){
                        return false;
                    }
                    curr=curr.children[idx];
                }
                if(curr.endOfWord!=true){
                    return false;
                }
                return true;
            }
    
            public static String ans="";
            public static void longest(Node root,StringBuilder temp) {
                if(root==null){
                    return;
                }
                for(int i=0;i<26;i++){
                    if(root.children[i]!=null && root.children[i].endOfWord==true){
                        temp.append((char)(i+'a'));
                        if(temp.length()>ans.length()){
                            ans=temp.toString();
                        }
                        longest(root.children[i],temp);
                        temp.deleteCharAt(temp.length()-1); //backtrack
                    }
                }
            }
        public static void main(String[] args) {    
            String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
            for(String s : words) {
                insert(s);
            }
            longest(root, new StringBuilder(""));
            System.out.println(ans);
        }
    
    
}
