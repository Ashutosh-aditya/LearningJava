
import java.util.*;
class pat1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        int c=1;
        for (int i = 0; i <n; i++)
        {
            for( int j = 0; j <n; j++)
            {
                if(j<i+1)
                System.out.print(" "+(c++)+" ");

            }
            System.out.println();
        }
        sc.close();
    }
}