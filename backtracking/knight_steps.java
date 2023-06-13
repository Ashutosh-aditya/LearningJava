
public class knight_steps {

    public static void init(int board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length;j++){
                board[i][j]=-1;
            }
        }
    }
    public static void knightMoves(int board[][],int row,int col) {
        //base-case
        if(row==(board.length-1) && col==(board.length-1)) {
            printBoard(board);
            return;
        }
        
    }

    private static void printBoard(int[][] board) {
        for(int i=0; i<board.length;i++) {
            for(int j=0; j<board[i].length;j++) {
                System.out.println(" "+board[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
