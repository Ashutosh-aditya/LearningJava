public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addFirst(int data){
        Node n1 = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=n1;
            return;
        }
        Node temp=head;
        n1.next=temp;
        temp.prev=n1;
        n1.prev=null;
        head=n1;
        return;
    }
    public void print(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    void removeFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        size--;
        head=head.next;
        head.prev=null;
    }

    public void revList(){
        Node pre=null,nxt,cur;
        cur=head;
        while(cur!=null){
            nxt=cur.next;
            cur.next=pre;
            cur.prev=nxt;
            pre=cur;
            cur=nxt;
        }
        head=pre;
    }

    public static void main(String[] args) {
        DoublyLL dl=new DoublyLL();
        for(int i=11;i>0;i--)
        dl.addFirst(i);
        dl.print();
        System.out.println("\n"+size);
        dl.removeFirst();
        dl.print();
        dl.revList();
        System.out.println("<->");
        dl.print();
    }
    
}
