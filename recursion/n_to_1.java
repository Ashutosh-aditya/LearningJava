import java.util.*;
public class n_to_1 {
    public static int pnum(int n)
    {
        if(n==1)
            {
                System.out.println("1 ");
                return 1;
            }
        else
            {
                System.out.print(n+" ");
                return pnum(n-1);
            }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pnum(n);
        sc.close();
    }
}

