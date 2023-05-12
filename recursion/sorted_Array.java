public class sorted_Array {

    public static boolean isSorted(int ar[],int i) {
        if(i+1==ar.length)
            return true;
        else if(ar[i]>ar[i+1])
            return false;
        else 
            return isSorted(ar, ++i);
        
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9,10,1};
        System.out.println(isSorted(ar, 0));
    }
}
