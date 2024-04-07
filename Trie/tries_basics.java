public class tries_basics {
    static class Node{
        Node children[];
        Boolean endOfWord;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            endOfWord=false;
        }

        static Node root=new Node();
        
        public static void insert(String word,int idx,Node n){
            if(idx==word.length()){
                n.children[idx].endOfWord=true;
                return;
            }
        
            if(n.children[idx]==null){
                Node n1 = new Node();
            }
            insert(word, idx+1, n.children[idx]);
        }
        public static void main(String[] args) {
            
        }
    }
}
