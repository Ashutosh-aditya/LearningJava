public class Search_in_shifted_soted_array {
    public static int search(int ar[],int tar, int si,int ei) {
        if(si>ei) 
            return -1;
        int mid=si+(ei-si)/2;
        if(ar[mid]==tar)
        return mid;
        if (ar[si]<=ar[mid]) //on line L1
        {
            if(tar>=ar[si] && tar<=ar[mid]) // Left of mid
            {
                return search(ar, tar, si, mid-1);
            }
            else// Right of mid
            {
                return search(ar, tar, mid+1, ei);
            }
        }
        else // on line L2
        {
            if(tar>=ar[mid] && tar<=ar[ei]) // Right of mid
            {
                return search(ar, tar, mid+1, ei);
            }
            else// Left of mid
            {
                return search(ar, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int ar[]={10,11,12,13,14,15,1,2,3,4,5,6,7,8,9};
        System.out.println(search(ar, 10, 0, 14));
    }
}