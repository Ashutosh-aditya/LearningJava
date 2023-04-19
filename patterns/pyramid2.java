
import java.util.*;
class pyramind2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        for (int i = 0; i <n; i++)
        {
            for( int j = 0; j <n; j++)
            {
                if(j<=i)
                System.out.print(" * ");
                else
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    
}