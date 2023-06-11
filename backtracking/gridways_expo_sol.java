public class gridways_expo_sol {
    public static int gridWays(int i,int j,int m,int n) {
        //base case
        if(i==m-1 && j==n-1) //LOGICAL AND CONDITION
            return 1;
        else if(i==m || j==n) //LOGICAL OR CONDITION
            return 0;
        
        //recursive case
        int w1,w2;
        w1=gridWays(i+1,j,m,n);
        w2=gridWays(i, j+1, m, n);
        return (w1+w2);
    }
    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 3, 3));
    }
}
