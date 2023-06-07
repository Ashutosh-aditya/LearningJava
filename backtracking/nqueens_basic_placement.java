public class nqueens_basic_placement {
    public static void nQueens(char board[][],int row ) {
        if(row==board.length)
        {
            printBoard(board);
            return;
        }
        for(int i=0;i<board.length;i++)
        {
            board[row][i]='Q';
            nQueens(board, row+1);
            //  board[row][i]='.'; 
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
        int n=2;
        char board[][] = new char[n][n];
        nQueens(board, 0);
    }
}
