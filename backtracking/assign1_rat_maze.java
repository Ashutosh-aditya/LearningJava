public class assign1_rat_maze{
    public static void path(int maze[][],int sol[][],int row,int col,int m,int n){
        //base-case
        if(row==m-1 && col==n-1){
            System.out.println("Solution found");
            sol[row][col]=1;
            printSol(sol);
            System.exit(0);
            
        }
        //recursive phase

        // //left check
        // if((col-1>=0) && ( maze[row][col-1]==1)){
        //     sol[row][col]=1;
        //     path(maze, sol, row, col-1, m, n);            
        //     sol[row][col]=0;
        // }
        
        //down check
        if((row+1<m) && (maze[row+1][col]==1)){
            sol[row][col]=1;
            path(maze, sol, row+1, col, m, n);
            sol[row][col]=0;
        }

        //right check
        if((col+1<n) && (maze[row][col+1]==1)){
            sol[row][col]=1;
            path(maze, sol, row, col+1, m, n);
            sol[row][col]=0;
        }

        //up check
        if((row-1>=0) && (maze[row-1][col]==1)){
            sol[row][col]=1;
            path(maze, sol, row-1, col, m, n);
            sol[row][col]=0;
        }
    }
    
    public static void printSol(int sol[][]){
        System.out.println();
        for(int i=0; i<sol.length;i++){
            for(int j=0;j<sol[i].length;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = {{1,0,0,0 },{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        int sol[][]= {{0,0,0,0 },{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        printSol(maze);
        path(maze, sol, 0, 0, 4, 4);
    }
}