public class powers_of_2 {
    public static boolean isInPowerOfTwo(int n) {
        return ((n&(n-1))==0 ? true : false);        
    }
    public static void main(String[] args) {
        System.out.println(isInPowerOfTwo(10));
        System.out.println(isInPowerOfTwo(32));
    }
}
