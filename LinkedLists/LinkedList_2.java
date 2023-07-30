public class LinkedList_2 {
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

    public Node findMid(){
        Node fast,slow;
        fast=slow=head;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean findPalin(){
        Node mid=findMid();
        if(size<2) return true;
        Node curr=mid,pre=null,nxt=curr.next;
        while(curr.next!=null){
            curr.next=pre;
            pre=curr;
            curr=nxt;
            nxt=nxt.next;
        }
        curr.next=pre;
        Node left=head,right=curr;
        while(right.next!=null){
            if(left.data!=right.data)
                return false;
        }
        return true;
    }
    
    public boolean findCycle(){
        Node fast,slow;
        fast=slow=head;
        while(fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast.data==slow.data){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        if(!findCycle()){
            System.out.println("No cycle found");
            return;
        }
        Node fast,slow,pre;
        int flag=0;
        slow=fast=head;
        while(fast.next!=null && fast!=null && flag==0){
            fast=fast.next.next;
            slow=slow.next;
            if(fast.data==slow.data){
                pre=fast;
                slow=head;
                while(flag==0){
                    pre=fast;
                    fast=fast.next;
                    slow=slow.next;
                    // System.out.println(pre.data);
                    if(fast.data==slow.data){
                        // System.out.println(pre.data);
                        pre.next=null;
                        flag=1;
                    }
                }
            }
        }
        System.out.println("Cycle Removed");
    }
    public static void main(String[] args) {
        LinkedList_2 ll = new LinkedList_2();
        for(int i=10;i>=0;i--){
            ll.addNodeFirst(i);
        }
        ll.disp();
        // tail.next=head;  //uncomment to generate the cycle
        System.out.println(ll.findCycle()); //floyd's Cycle finding algorithm
        ll.removeCycle();
        tail.next=head.next.next; //uncomment to generate the cycle
        System.out.println(ll.findCycle()); //floyd's Cycle finding algorithm
        ll.removeCycle();
        ll.disp();
    }
}
