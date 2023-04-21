
import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        int c=n-1;
        for (int i = 0; i <n; i++)
        {
            for( int j = 0; j <(2*n-i); j++)
            {
                if(j<c)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print(" * ");
                }
            }c--;
            System.out.println();
        }
        sc.close();
    }
}
