public class last_Occurance {

    public static int lastOccurance(int ar[],int i,int key) {
        if(ar.length==i+1)
            {
                return -1;
            }
        int res=lastOccurance(ar, i+1, key);
        if(res==-1 && ar[i]==key)
            {
                return i;
            }
        return res;
            
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,9,5,6,7,8,9};
        System.out.println(lastOccurance(ar, 0, 9 ));
    }
}
