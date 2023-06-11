public class nqueen_self_test {
    public static void nQueens(char board[][],int row) {
        int n=board.length;
        if(row==n)
        {
            System.out.print("\n("+(++count)+") ");
            printBoard(board);
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nQueens(board, row+1);            
                board[row][i]='X';     
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col) {
        //up condition
        for(int i = row-1; i >=0 ;i--){
            if(board[i][col]=='Q') 
                return false;
        }
        //left up diagonal condition
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')
                return false;
        }
        //right up diagonal condition
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
    public static int count=0;
    public static void printBoard(char board[][]) {
        int n=board.length; 
        System.out.println("--------CHESS BOARD--------");
        for(int i=0;i<n;i++){
                        System.out.print("\t");
            for(int j=0;j<n;j++){
                System.out.print(" "+board[i][j]+"");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int n=6;
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