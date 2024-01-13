
public class using_array {
    public static class queue{
        int size=5,front=0,back=-1;
        int ar[]=new int[size];
        public void enque(int x){
            if((back+1)<size){
                ar[++back]=x;
            }
            else
            System.out.println("Error System Overflow");
        }
        public void deque(){
            if((front+1)<size)
                front++;
            else
            System.out.println("Error System Underflow");
        }
        void peek(){
            System.out.println(ar[front]);
        }
        void printQ(){
            for(int i=front;i<=back;i++){
                System.out.print(ar[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        queue q1 = new queue();
        for(int i=5;i<10;i++){
            q1.enque(i);
        }
        q1.printQ();
        q1.deque();
        q1.printQ();
    }
}
