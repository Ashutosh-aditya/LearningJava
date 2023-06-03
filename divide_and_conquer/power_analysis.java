public class power_analysis {

    public static long power(int a,int n)
    {
        if(n==0)
            return 1;
        else
            return (a*power(a,n-1));


    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
