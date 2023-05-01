public class Selection_Sorting {
    public static void SelectionSort(int ar[])
    {
        int minPos=0,n=ar.length;
        System.out.print("Array before sorting : ");
        printArray(ar);
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[minPos]>ar[j])
                {
                    minPos=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[minPos];
            ar[minPos]=temp;
        }
        System.out.print("Array before sorting : ");
        printArray(ar);
    }

    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        SelectionSort(arr);
    }
}
