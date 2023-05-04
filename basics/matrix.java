import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=0,c=0;
        System.out.print(" Enter no. of rows in the matrix : ");
        r=sc.nextInt();
        System.out.print(" Enter no. of columns in the matrix : ");
        c=sc.nextInt();
        int mat[][] = new int[r][c];
        System.out.println("Enter values :-");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j] =sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                max=Integer.max(max, mat[i][j]);
                min=Integer.min(min, mat[i][j]);
            }
        }
        System.out.println("MAX: " + max+" \nmin: " + min);
        sc.close();
    }
}
