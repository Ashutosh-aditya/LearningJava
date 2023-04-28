public class kadans_algo {

    public static void kadans(int ar[])
    {
        int ms,cs,s=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>s) s=ar[i];
        }
        cs=ms=s;
        System.out.println("s="+s);
        for(int i=0;i<ar.length;i++)
        {
            cs=cs+ar[i];
            if (cs>ms) ms=cs;
            if ((cs)<0) cs=0;
        }
        System.out.println("Maximum subArray sum : "+ms);
    }

    public static void main(String[] args) {
        int ar[]={1,-2,6,-1,3},ar1[]={-1,-2,-3,-5};
        // kadans(ar);
        kadans(ar1);
    }
}
