import java.util.*;
public class inbuilt_Sort {

    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println(" ");
    }

    public static void IntegerArrayPrint(Integer ar[])
    {
        System.out.println(" Printing Integer class Array ");
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,5,6,4,1,3,2};
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        
        int arr1[]={9,8,7,5,6,4,1,3,2};
        printArray(arr1);
        Arrays.sort(arr1, 0, 5);
        printArray(arr1);

        //sorting in decending order 
        Integer arr2[]={1,2,3,4,5,6,7,8,9};
        IntegerArrayPrint(arr2);
        //Collections.reverseOrder() returns the object of comperator not compatible with int
        // to use this method replace 'int' in declearition with 'Integer' it is a object class of int 
        Arrays.sort(arr2,Collections.reverseOrder());
        IntegerArrayPrint(arr2);

    }
}
