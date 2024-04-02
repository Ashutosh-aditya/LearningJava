public class Understanding_Heap_Sort {
    public static void heapSort(int arr[]){
        // step 1 - Build MaxHeap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){ // O(nlogn)
            Heapify(arr,i,n);
        }
        // Step 2 - put largest element at the end
        for(int i=n-1; i>=0; i--){
            //swap largest(first) with last
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            Heapify(arr,0,i); // O(nlogn)
        }
    }

    private static void Heapify(int[] arr, int i, int size) {
        int left=2*i+1;
        int right=2*i+2;
        int MaxIdx=i;

        if(left<size && arr[left]>arr[MaxIdx]){
            MaxIdx=left;
        }
        if(right<size && arr[right]>arr[MaxIdx]){
            MaxIdx=right;
        }
        if(MaxIdx!=i){
            //swap
            int temp=arr[i];
            arr[i]=arr[MaxIdx];
            arr[MaxIdx]=temp;

            Heapify(arr,MaxIdx,size);
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        heapSort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
