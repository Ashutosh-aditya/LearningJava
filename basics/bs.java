import java.util.*;

public class bs {
    static void binarySearch(int ar[],int key)
    {
        Arrays.sort(ar);
        System.out.println("\nSorted array is : ");
        dispArray(ar);
        System.out.println("");
        int s=0,l=ar.length-1,m=(s+l)/2,c=0,f=0;
        while(s<=l)
        {
            
            System.out.println("1st l="+l+" s="+s+" m="+m);
            c++;
            if(key==ar[m])
            {
                System.out.println("Key found at index "+m);
                f=1;
                break;
            }
            else if(key<ar[m])
            {
                // System.out.println("i<k mid= "+m);
                l=m-1;
                m=(l+s)/2;
            }
            else 
            {
                // System.out.println("i>k mid= "+m);
                s=m+1;
                m=(l+s)/2;
            }
            System.out.println("2ns l="+l+" s="+s+" m="+m+"\n");
        }
        
        if(f==0)
        System.out.println("No-match found");
        System.out.println("Total no. of comparisons : "+c);
    }

    static void dispArray(int ar[])
    {
        System.out.println("The list numbers are ");
        for(int i=0; i<ar.length; i++)
        {
            System.out.print(ar[i]+" ");
            if((i+1)%40==0)
            System.out.println(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of elements to be in the list : ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        System.out.println(ar.length);
        System.out.print("Enter key to be searched in the list : ");
        int key=sc.nextInt();
        binarySearch(ar,key);
        sc.close();
    }
}
