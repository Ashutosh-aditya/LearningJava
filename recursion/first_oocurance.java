public class first_oocurance {

    public static int firstOccurance(int ar[],int i,int key) {
        if(ar.length==i+1)
            return -1;
        else if(ar[i]==key)
            return i;
        else 
            return firstOccurance(ar, ++i, key);
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,9,5,6,7,8,9};
        System.out.println(firstOccurance(ar, 0, 9 ));
    }
}
