public class pairs {

    public static void find_pair(int ar[])
    {int tp=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                System.out.print("( "+ar[i]+" , "+ar[j]+" ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tp);
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        find_pair(ar);
    }
}
