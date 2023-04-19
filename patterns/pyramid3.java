
import java.util.*;
class pyramind3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        int b=n-1;
        for (int i = 0; i <n; i++)
        {
            for( int j = 0; j <n; j++)
            {
                if(j<b)
                System.out.print("   ");
                else
                System.out.print(" * ");
            }
            System.out.println();
            b--;
        }
    }
    
}