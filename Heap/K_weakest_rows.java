import java.util.PriorityQueue;

public class K_weakest_rows {
    static class rows implements Comparable<rows>{
        int solderCount;
        int idx;
        rows(int solderCount,int idx){
            this.solderCount=solderCount;
            this.idx=idx;
        }
        @Override
        public int compareTo(rows r2){
            if(this.solderCount==r2.solderCount){
                return this.idx-r2.idx;
            }
            else{
                return this.solderCount-r2.solderCount;
            }
        }
    }
    public static void main(String[] args) {
        int army[][]={
                        {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0},
                    };
                    
        int k=2;
        PriorityQueue<rows> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int sum=0;
            for(int j=0;j<army[i].length;j++){
                    sum=sum+army[i][j];
            }
            pq.add(new rows(sum,i));
        }
        while(k>0){
            System.out.println("R"+pq.remove().idx);
            k--;
        }
    }
}
