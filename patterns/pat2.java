
import java.util.*;
class pat2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        int c=1;
        for (int i = 0; i <n; i++)
        {
            c=(i+1)%2;
            for( int j = 0; j <n; j++)
            {
                if(j<i+1)
                {
                    System.out.print(" "+c+" ");
                    if(c==1) c=0;
                    else c=1;
                }
                else break;
            }
            System.out.println();
        }
        sc.close();
    }
}