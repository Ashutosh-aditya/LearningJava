public class diagonal_sum {
    public static void diagonalSum(int mat[][])
    {
        int n=mat.length,sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+mat[i][i];
            if(i!=(n-i-1))
            sum=sum+mat[i][n-1-i];
        }
        System.out.println("Diagonal sum is : "+sum);
    }
    public static void main(String[] args) {
        int mat [][] =   {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9},
                        };
        diagonalSum(mat);
    }
}
