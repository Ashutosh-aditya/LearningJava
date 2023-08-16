
public class LinkedList_3 {
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

    public Node zigzag(){
        Node fast=head.next,slow=head,mid;
        //find mid point
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        System.out.println("mid->"+slow.data);
        //rev 2nd list
        Node curr=mid.next,pre=null,nxt;
        mid.next=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        Node right=pre,left=head;
        Node temp = new Node(-1);
        while(left!=null && right!=null){
            temp.next=left;

        }

        return head;
    }

    public void disp(Node n1){
        Node n=n1;
        while(n!=null){
            System.out.print(n.data+" -> ");
            n=n.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedList_3 ll =new LinkedList_3();
        for(int i=8; i>0; i--)
            ll.addNodeFirst(i);
        ll.disp();
        Node revl=ll.zigzag();
        ll.disp();
        ll.disp(revl);
    }
}
