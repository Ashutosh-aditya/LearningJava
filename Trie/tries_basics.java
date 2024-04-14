public class tries_basics {
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
        

        // public static void insert(String word,int idx,Node n){
        //     if(idx==word.length()){
        //         n.children[idx].endOfWord=true;
        //         return;
        //     }
        //     if(n.children[idx]==null){
        //         Node n1 = new Node();
        //     }
        //     insert(word, idx+1, n.children[idx]);
        // }

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

        public static boolean wordBreak(String key) { //O(L)
            if(key.length()==0){
                return true;
            }
            for(int i=1;i<=key.length();i++){
                if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                    return true;
                }
            }
            return false;
        }

        public static boolean searchPrefix(String str) { //O(L)  length of word
            Node curr=root;
            for(int level=0;level<str.length();level++){
                int idx=str.charAt(level)-'a';
                if(curr.children[idx]==null){
                    return false;
                }
                curr=curr.children[idx];
            }
            return true;
        }

        public static void main(String[] args) {
            // String words[] = {"the","a","there","their","any","thee"};
            String words1[]={ "i", "like", "sam", "samsung", "mobile", "ice","there"};
            for(String s : words1) {
                insert(s);
            }
            if(search("ther")){
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }
            System.out.println("wordbreak-"+wordBreak("ilikesamsung"));

            if(searchPrefix("ther")){
                System.out.println("Prefix Found");
            }
            else{
                System.out.println("Prefix Not Found");
            }
        }
}
