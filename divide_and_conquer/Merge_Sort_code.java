public class Merge_Sort_code {
    
    public static void mergeSort(int ar[],int si,int ei)
    {
        if(si==ei) return;
        int mid=si+(ei-si)/2;
        mergeSort(ar, si, mid);
        mergeSort(ar, mid+1, ei);
        merge(ar,si,mid,ei);
    }

    private static void merge(int[] ar, int si,int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei)
        {
            if(ar[i]< ar[j])
            {
                temp[k] = ar[i];
                i++;
            }
            else 
            {
                temp[k] = ar[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
            temp[k++] = ar[i++];
        while(j<=ei)
            temp[k++] = ar[j++];
        for(i=si,k=0;k<temp.length;k++,i++) //chance of error like for(i=0;i<ei-1;i++)
            {
                //System.out.println("<"+i+">");
                ar[i]=temp[k];
            }
        // printArray(temp);
    }

    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int ar[]={9,8,7,4,5,6,3,2,1,-10};
        printArray(ar);
        mergeSort(ar, 0, ar.length-1);
        printArray(ar);
        
    }
}
