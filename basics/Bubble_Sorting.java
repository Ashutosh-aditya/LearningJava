public class Bubble_Sorting {

    public static void BubbleSort(int ar[])
    {
        int n=ar.length;
        System.out.print("Array before sorting : ");
        printArray(ar);
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(ar[j]>ar[j+1])
                    {
                        int temp=ar[j+1];
                        ar[j+1]=ar[j];
                        ar[j]=temp;
                    }
            }
        }
        System.out.print("Array after sorting : ");
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
        BubbleSort(arr);
    }
}
