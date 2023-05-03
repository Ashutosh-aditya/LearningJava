public class spiral_matrix {
    // for square matrix
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
            // System.out.println("-1-");

            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(mat[i][endCol]+" ");
            }
            // System.out.println("-2-");

            for(int j=endCol-1;j>=startCol;j--)
            {
                if(endCol==startCol)
                break;
                System.out.print(mat[endRow][j]+" ");
            }
            // System.out.println("-3-");

            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(endRow==startRow)
                break;
                System.out.print(mat[i][startCol]+" ");
            }
            // System.out.println("-4-");

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
