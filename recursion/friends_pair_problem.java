public class friends_pair_problem {
    public static int friend(int n) {
        if(n==1 || n==2) return n;
        int s=friend(n-1);
        int p=friend(n-2)*(n-1);
        return s+p;
    }
    public static void main(String[] args) {
        System.out.println(friend(3));
    }
}

