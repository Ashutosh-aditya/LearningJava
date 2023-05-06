import java.util.Scanner;

public class basic_bitwise_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 2 numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(" ");
        System.out.println(a+" & "+b+" = "+(a&b));
        System.out.println(" ");
        System.out.println(a+" | "+b+" = "+(a|b));
        System.out.println(" ");
        System.out.println(a+" ^ "+b+" = "+(a^b));
        System.out.println(" ");
        System.out.println(a+"'s Compliment : "+(~a));
        System.out.println(" ");
        System.out.println(b+"'s Compliment : "+(~b));
        System.out.println(" ");
        System.out.println(a+" << "+b+" = "+(a<<b));
        System.out.println(" ");
        System.out.println(a+" >> "+b+" = "+(a>>b));
        System.out.println(" ");
        sc.close();
    }
}
