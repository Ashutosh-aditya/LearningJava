public class counting_Sort {
    public static void CountingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }
        int index=0;
        for(int i = 0; i < arr.length; i++)
        {
            while(count[i]>0)
            {
                arr[index]=i;
                count[i]--;
                index++;
            }
        }
    }
}
