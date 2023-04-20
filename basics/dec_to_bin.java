
import java.util.Scanner;

public class dec_to_bin {

    public static void dec2bin(int n)
    {
        int num=n,res=0,i=0;
        while(num>0)
        {
            int d=num%2;
            res=res+d*(int)Math.pow(10,i);
            num=num/2;
            i++;
        }
        System.out.println("The binary of "+n+" is "+res);
    }

    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a num : ");
            int n=sc.nextInt();
            dec2bin(n);
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
