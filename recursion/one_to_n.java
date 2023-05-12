import java.util.*;
public class one_to_n {
    public static void pnum(int n)
    {
        if(n==1)
            {
                System.out.print("1 ");
            }
        else
            {
                pnum(n-1);
                System.out.print(n+" ");
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
