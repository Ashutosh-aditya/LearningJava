
public class subarrays {
    public static int ts=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
    public static void pString(int ar[],int start,int end)
    {
        int sum=0;
        System.out.print("( ");
        for(int i = start; i <= end; i++)
            {
                System.out.print(ar[i]+" ");
                sum=ar[i]+sum;
            }
            System.out.print(")  ");
            ts++;
        if(sum>max) max=sum;
        if(sum<min) min=sum;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(" ");
        for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                pString(ar, i, j);
            }
            System.out.println(" ");
            
        }
        System.out.println("Total subArrays : "+ts);
        System.out.println("Max Sum : "+max+"\nMin Sum : "+min+"\n");
    }
}
