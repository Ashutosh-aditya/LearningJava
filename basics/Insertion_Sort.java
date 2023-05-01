public class Insertion_Sort {
    public static void insertionSort(int ar[])
    {
        System.out.print("Array before sorting : ");
        printArray(ar);
        for(int i=1; i<ar.length; i++)
        {
            int cur=ar[i],prev=i-1;
            while(prev >= 0 && cur < ar[prev])
            {
                ar[prev+1] = ar[prev];
                prev--;
            }
            ar[prev+1]=cur;
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
        insertionSort(arr);
    }
}
