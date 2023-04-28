public class rev_array {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9,10},s=0,l=ar.length-1;
        while(s<l)
        {
            int temp=ar[s];
            ar[s]=ar[l];
            ar[l]=temp;
            s++;l--;
        }
        for(int i=0; i<(ar.length);i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    
}
