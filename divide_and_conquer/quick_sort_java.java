public class quick_sort_java {

    public static void quickSort(int ar[],int si,int ei) {
        if(ei<si)
            return;
        int idx=partition(ar,si,ei);
        quickSort(ar,si,idx-1);
        quickSort(ar,idx+1,ei);
    }

    public static int partition(int ar[],int si,int ei) 
    {
        int pivot=ar[ei],i=si-1;
        for(int j=si;j<ei;j++)
        {
            if(ar[j]<pivot)
            {
                i++;
                int temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
        }
        i++;
        int temp=ar[i];
        ar[i]=ar[ei];
        ar[ei]=temp;
        return i;
}

    public static void printArray(int ar[]) {
        for(int i=0; i<ar.length; i++) 
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int ar[]={9,8,7,6,5,4,3,2,1};
        printArray(ar);
        quickSort(ar, 0, ar.length-1);
        printArray(ar);
    }
}
