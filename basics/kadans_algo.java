public class kadans_algo {

    public static void kadans(int ar[])
    {
        int ms,cs,s=ar[0];
        ms=cs=s;
        for(int i=1;i<ar.length;i++)
        {
            if(cs>0)
            {
                if(ar[i]>0)
                {
                    cs=cs+ar[i];
                    ms=Math.max(cs, ms);
                }
                else
                {
                    if((cs+ar[i])<0)
                    {
                        cs=0;
                        ms=Math.max(cs, ms);
                    }
                    else
                    {
                        cs=cs+ar[i];
                        ms=Math.max(cs, ms);
                    }
                }
            }
            else
            {
                if(ar[i]>0)
                {
                    cs=ar[i];
                    ms=Math.max(cs, ms);
                }
                else
                {
                    if(ar[i]>cs)
                    {
                        cs=ar[i];
                        ms=Math.max(cs, ms);
                    }
                    else
                    {
                        ms=Math.max(cs, ms);
                        cs=ar[i];
                    }
                }
            }
        }
        System.out.println("Maximum subArray sum : "+ms);
    }

    public static void main(String[] args) {
        int ar1[]={-1,-2,-3,-5};
        int[] t1 = {-2, -3, 4, -1, -2, 1, 5, -3}; // expected output: 7 (sum of subarray {4, -1, -2, 1, 5})
        int[] t2 = {1, 2, 3, 4, 5};               // expected output: 15 (sum of subarray {1, 2, 3, 4, 5})
        int[] t3 = {-1, -2, -3, -4, -5};          // expected output: -1 (largest element in array)
        int[] t4 = {5, -2, 3, 1, 2};              // expected output: 9 (sum of subarray {5, -2, 3, 1, 2})
        int[] t5 = {1, -2, 3, -4, 5, -6, 7};      // expected output: 7 (sum of subarray {5, -6, 7})
        int[] t6 = {-1,-2,-3,-4,-5,-6};      // expected output: -1 (sum of subarray {-1})

        kadans(ar1);
        kadans(t1);
        kadans(t2);
        kadans(t3);
        kadans(t4);
        kadans(t5);
        kadans(t6);
    }
}
