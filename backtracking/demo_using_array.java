
public class demo_using_array {
    public static void modArray(int ar[],int index)
    {
        if(index==5)
        {
            printArray(ar);
            return;
        }
        // printArray(ar);
        ar[index]=index+1;
        modArray(ar,index+1);
        // printArray(ar);
        ar[index]-=2;
        // printArray(ar);
        // System.out.println(" ");
    }
    public static void printArray(int ar[]) {
        for(int i=0;i<5;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int array[] = new int[5];
        modArray(array, 0);
        printArray(array);
    }
}