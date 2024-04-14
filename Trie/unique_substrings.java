public class unique_substrings {
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

    public static int  countNodes(Node newroot){
        if(newroot==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(newroot.children[i]!=null){
                count+=countNodes(newroot.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str="ababa"; //ans=10
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }

}
