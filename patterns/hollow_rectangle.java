
import java.util.*;
public class hollow_rectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length : ");       
        int l=sc.nextInt();
        System.out.print("Enter a breadth : ");       
        int b=sc.nextInt();
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<b; j++)
            {
                if(i==0 || i==l-1 || j==0 || j==b-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}