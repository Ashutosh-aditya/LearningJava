import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        int c=n-1;
        for (int i = 0; i <2*n; i++)
        {
            for( int j = 0; j <(n+i); j++)
            {
                if(i<n)
                {
                    if(j<c-i)
                    {
                        System.out.print("   ");
                    }
                    else
                    {
                        System.out.print(" * ");
                    }
                }
                // else
                // {
                //     if()
                //     {
                //         System.out.print(" * ");
                //     }
                //     else
                //     {
                //         System.out.print("   ");
                //     }
                // }
            }
            System.out.println();
            if(c==0)
            c=n;
        }
        sc.close();
    }
}
