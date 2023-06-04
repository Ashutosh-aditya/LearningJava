public class power_analysis_2 {
    public static int power(int a,int n) {
        if(n==1)
            return a;
        else
            return (power(a,n/2)*power(a,n/2));
    }
    public static void main(String[] args) {
        System.out.println(power(2,8));
    }
}
