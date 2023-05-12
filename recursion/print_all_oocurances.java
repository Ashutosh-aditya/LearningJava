public class print_all_oocurances {
    public static void allOccurances(int ar[],int key,int idx) {
        if(idx==ar.length)
            return;
        else if(ar[idx]==key)
        {
            System.out.print(idx+" ");
        }
        allOccurances(ar, key, idx+1);
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,2,5,2,8,9,2};
        allOccurances(ar, 2, 0);
    }
}
