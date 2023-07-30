
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
        System.out.println(d+" has been removed");
        head=head.next;
        size--;
        return;
    }

    public void removeL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        };
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        System.out.println(temp.next.data+" has been removed");
        temp.next=null;
        tail=temp;
        size--;
        return;
    }

    public int itrSearch(int key){
        if(head==null){
            System.out.println("List is empty");
            return -1;
        };
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key)
            return i;
            i++;
            temp=temp.next;
        }
        return -1;
    }

    public int recSearch(int key,Node temp,int i){
        if(head==null){
            System.out.println("List is empty");
            return -1;
        };
        if(temp==null){
            return -1;
        }else if(temp.data==key){
            return i;
        }else{
            return recSearch(key, temp.next, i+1);
        }
    }

    public void revLL(){
        Node pre,cur,nxt;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        pre=null;
        cur=head;
        tail=head;
        nxt=cur.next;
        while(cur.next!=null){
            // System.out.println(cur.data+"<-");
            cur.next=pre;
            pre=cur;
            cur=nxt;
            nxt=nxt.next;
        }
        cur.next=pre;
        head=cur;
        // head=pre;
    }
    
    public void removeNthFromLast(int index){
        if(index>size-1){
            System.out.println("Out of index");
            return;
        }
        Node temp=head;
        int i=1;
        if(index==size-1) {
            head=head.next;
            return;
        }
        while(i<(size-index-1)){
            i++;
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        temp.next=temp.next.next;
        System.out.println();
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
        System.out.println(ll.itrSearch(100));
        System.out.println(ll.itrSearch(121));
        System.out.println("rec -> "+ll.recSearch(100,head,0));
        for(int i=10;i>=0;i--) ll.addNodeFirst(i);
        ll.disp();
        ll.revLL();
        ll.disp();
        System.out.println(ll.size);
        ll.removeNthFromLast(13);
        ll.disp();
    }
}
