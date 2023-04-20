import java.util.*;
class butterfly
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter half the no. of lines : ");
        int n = sc.nextInt();
        System.out.println();
        int n1=n,c=1;
        n=n*2;
        for (int i = 0; i <n; i++)
        {
            for( int j = 0; j <n; j++)
            {
                if(i<n/2)
                {
                    if( (j<(i+1) || j>(n-1-i-1)) )
                        System.out.print("  *  ");
                    else 
                        System.out.print("     ");
                }
                else
                {
                    if( (j>(n1-(c-n1)) ) && (j<(n1+(c-n1)-1)))
                        System.out.print("     ");
                    else 
                            System.out.print("  *  ");
                }
                
            }c++;
            System.out.println();
        }
        sc.close();
        System.out.println();
    }
}
