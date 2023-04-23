import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        int c=n-1,l=0,str=0;
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
                else
                {
                    if(j<=(l-n) || j>n-1 )
                    {
                        System.out.print("   ");
                    }
                    else
                    {
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println();
            l++;
            if(c==0)
            c=n;
        }
        sc.close();
    }
}
