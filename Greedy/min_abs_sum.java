import java.util.*;
public class min_abs_sum {
    public static void main(String[] args) {
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};
        // int A[]={1,2,3};
        // int B[]={2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int diff=0;
        for(int i=0;i<A.length;i++){
            diff+=Math.abs(A[i]-B[i]);
        }
        System.out.println(diff);
    }
}
