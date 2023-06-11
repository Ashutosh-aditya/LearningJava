public class sudoku_sol {
    public static void printSudoku(int sudoku[][])
    {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if((j+0)%3==0 )
                    System.out.print(" | ");
                System.out.print(" "+sudoku[i][j]+" ");
                if(j==8)
                    System.out.print(" | ");
                }
                System.out.println();
                if((i+1)%3==0 && i!=8){
                    for(int k=0; k<7;k++){
                        System.out.print("- - - ");
                    }
            }
            System.out.println(" ");
        }
    }
    
    public static boolean sudokuSolver(int sudoku[][],int row,int col) {
        //base-case
        if(row==9)
        {
            // printSudoku(sudoku);
            return true;
        }
        //recursive 
        int nextRow=row,nextCol=col+1;
        if(nextCol==9)
        {
            nextRow++;
            nextCol=0;
        }

        //check if the place is empty   
        if(sudoku[row][col]!=0)
        return sudokuSolver(sudoku,nextRow,nextCol);

        //check for numbers to fill the sudoku
        for(int i=1;i<10;i++){
            if(isSafe(sudoku,row,col,i)){
                sudoku[row][col]=i;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        //column case
        for(int i=0;i<9;i++)
        {
            if(sudoku[i][col]==digit)
            return false;
        }
        //row case
        for(int i=0;i<9;i++)
        {
            if(sudoku[row][i]==digit)
            return false;
        }
        //grid case
        int nr=(row/3)*3,nc=(col/3)*3;
        for(int i=nr;i<(nr+3);i++){
            for(int j=nc;j<(nc+3);j++){
                if(sudoku[i][j]==digit)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sudoku[][]={
                        {0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3},
                        };
        System.out.println("\n \nGiven Sudoku ");
        printSudoku(sudoku);
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("\n\nSolution Exists");
            printSudoku(sudoku);
        }
        else
        System.out.println("\n\nSolution does not exist");
    }
}
