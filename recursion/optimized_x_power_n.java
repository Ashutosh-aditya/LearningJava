public class optimized_x_power_n {

    public static int powerOptimzed(int m,int n) {
        if(n==0)
            return 1;
            int res=powerOptimzed(m, n/2)*powerOptimzed(m, n/2);
            if(n%2==1)
            res*=m;
            return res;
    }

    public static void main(String[] args) {
        System.out.println(powerOptimzed(2, 5));
    }
}
