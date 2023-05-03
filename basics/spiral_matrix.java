public class spiral_matrix {
    public static void solution()
    {
        int mat[][] = new int[4][4],count=1;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                mat[i][j]=count++;
            }
        }

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                
            }
        }

    }

    public static void printPatter(int mat[][],int i,int r,int c)
    {}

    public static void main(String[] args) {
        solution();
    }
}
