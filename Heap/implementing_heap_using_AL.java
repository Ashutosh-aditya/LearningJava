import java.util.*;
public class implementing_heap_using_AL {
    static class heap {
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x=arr.size()-1; //child Index
            int par = (x-1)/2; //parent Index

            while(arr.get(x)<arr.get(par)){ //swap   O(logn)
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size() && arr.get(i)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }

            if(minIdx!=i){
                int temp = arr.get(minIdx);
                arr.set(minIdx,arr.get(i));
                arr.set(i,temp);

                heapify(minIdx);
            }
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
        public int remove(){
            //step-1 swap
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step-2 remove
            arr.remove(arr.size()-1);

            //step-3 heapify  O(logn)
            heapify(0);

            return temp;
        }
    }
    public static void main(String[] args) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
