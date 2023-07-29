
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head,tail;

    public void addNodeFirst(int data){
        Node n1 = new Node(data);
        if(head==null){
            head=tail=n1;
        }
        else{
            n1.next=head;
            head=n1;        
        }
        return;
    }

    public void addNodeLast(int data){
        Node n1= new Node(data);
        if(head==null){
            head=tail=n1;
        }
        else {
            tail.next=n1;
            tail=n1;
        }
        return;
    }

    public void addMid(int data,int index){
        Node n1=new Node(data);
        Node temp=head;
        int i=0;
        
    }

    public void disp(){
        if(head==null)
            System.out.println("Linked-List is EMPTY ");
        else {
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addNodeFirst(2);
        ll.addNodeFirst(1);
        ll.addNodeLast(3);
        ll.addNodeLast(4);
        ll.disp();
    }
}
