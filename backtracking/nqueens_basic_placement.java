public class nqueens_basic_placement {
    public static void nQueens(char board[][],int row ) {
        if(row==board.length)
        {
            printBoard(board);
            return;
        }
        for(int i=0;i<board.length;i++) //this function is used to generate total possible combinations
        {
            board[row][i]='Q'; // (1)fix the first queen 
            nQueens(board, row+1); //find total possible combinations for the queen seated in (1)
            board[row][i]='X'; //reset the postion to find total possible combinations for another position of queen
        }
    }
    public static void printBoard(char board[][]) {
        System.out.println("------------CHESS BOARD------------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        int n=3;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='X';
            }
            System.out.println(" ");
        }
        nQueens(board, 0);
    }
}
