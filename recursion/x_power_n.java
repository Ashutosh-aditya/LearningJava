public class x_power_n {
    
    public static int power(int m,int n) {
        if(n==0)
            return 1;
        else
            return m*power(m,--n);
    }
    public static void main(String[] args) {
        System.out.println(power(1, 0));
    }
}
