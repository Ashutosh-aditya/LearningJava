import java.util.*;
public class Question_using_PQ {
    static class cars implements Comparable<cars>{
        int x;
        int y;
        int dist;
        cars(int x,int y){
            this.x=x;
            this.y=y;
            this.dist=(x*x)+(y*y);
        }
        @Override
        public int compareTo(cars c1){
            return this.dist-c1.dist;
        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<cars> pq = new PriorityQueue<cars>();
        for(int i=0;i<pts.length;i++){
            pq.add(new cars(pts[i][0],pts[i][1]));
        }
        while(k>0){
            System.out.println(pq.peek().dist);
            pq.remove();
            k--;
        }
    }
}
