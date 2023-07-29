
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
    public int size=0;

    public void addNodeFirst(int data){
        size++;
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
        size++;
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
        Node temp=head.next;
        int i=0;
        if(size==0)
        addNodeFirst(data);
        for(i=0;i<index-2;i++){
            temp=temp.next;
        }
        n1.next=temp.next;
        temp.next=n1;
        size++;
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

    public void removeF(){
        if(head==null){
            System.out.println("List is empty");
            return;
        };
        int d=head.data;
        System.out.println(d+"has been removed");
        head=head.next;
        size--;
        return;
    }

    public void removeL(){
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addNodeFirst(2);
        ll.addNodeFirst(1);
        ll.addNodeLast(3);
        ll.addNodeLast(4);
        ll.disp();
        ll.addMid(100, 3);
        ll.disp();
        ll.removeF();
        ll.disp();
        ll.removeL();
        ll.disp();
    }
}
