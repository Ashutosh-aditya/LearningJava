import java.util.*;
public class Comparing_objects_in_PriorityQueue {
    static class student implements Comparable<student>{
        String name;
        int rank;
        student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s1){
            return this.rank - s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("E", 3)); //O(logn)
        pq.add(new student("D", 4)); //O(logn)
        pq.add(new student("C", 5)); //O(logn)
        pq.add(new student("B", 2)); //O(logn)
        pq.add(new student("A", 1)); //O(logn)
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank); //O(1)
            pq.remove(); //O(logn)
        }
        System.out.println();
        PriorityQueue<student> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.add(new student("E", 3)); //O(logn)
        pqr.add(new student("D", 4)); //O(logn)
        pqr.add(new student("C", 5)); //O(logn)
        pqr.add(new student("B", 2)); //O(logn)
        pqr.add(new student("A", 1)); //O(logn)
        while(!pqr.isEmpty()){
            System.out.println(pqr.peek().name+" -> "+pqr.peek().rank); //O(1)
            pqr.remove(); //O(logn)
        }
    }
}
