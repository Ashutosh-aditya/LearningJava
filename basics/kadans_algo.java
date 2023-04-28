public class kadans_algo {

    public static void kadans(int ar[])
    {
        int ms=Integer.MIN_VALUE,cs=0;
        for(int i=0;i<ar.length;i++)
        {
            cs=cs+ar[i];
            if ((cs)<0) cs=0;
            if (cs>ms) ms=cs;
        }
        System.out.println("Maximum subArray sum : "+ms);
    }

    public static void main(String[] args) {
        int ar[]={1,-2,6,-1,3};
        kadans(ar);
    }
}
