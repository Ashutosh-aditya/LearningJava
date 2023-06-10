public class nqueen_self_test {
    public static void nQueens(char board[][],int row) {
        int n=board.length;
        if(row==n)
        {
            printBoard(board);
            return;
        }
        for(int i=0;i<n;i++)
        {
            board[row][i]='Q';
            nQueens(board, row+1);            
            board[row][i]='X';            
        }
    }
    public static void printBoard(char board[][]) {
        int n=board.length; 
        System.out.println("--------CHESS BOARD--------");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("\t"+board[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int n=3;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
            System.out.println(" ");
        }
        nQueens(board, 0);
    }
}