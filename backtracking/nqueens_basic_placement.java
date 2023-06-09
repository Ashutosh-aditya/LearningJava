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
            board[row][i]='X'; 
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
                System.out.print(" "+'X'+" ");
            }
            System.out.println(" ");
        }
        nQueens(board, 0);
    }
}
