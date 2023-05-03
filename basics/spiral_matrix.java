public class spiral_matrix {
    public static void solution( int mat[][])
    {
        int startRow=0,startCol=0;
        int endRow=mat.length-1;
        int endCol=mat[0].length-1;
        while(startRow<=endRow && startCol<=endCol)
        {
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.print(mat[startRow][j]+" ");
            }

            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(mat[i][endCol]+" ");
            }

            for(int j=endCol-1;j<=startCol;j--)
            {
                System.out.print("---");
                System.out.print(mat[startRow][j]+" ");
            }

            for(int i=endRow-1;i<=startRow+1;i--)
            {
                System.out.print(mat[i][endCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }


    public static void main(String[] args) {
        int mat[][]={   {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };
        solution(mat);
    }
}
