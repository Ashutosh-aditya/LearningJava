import java.util.*;
public class Coin_change {
    public static void printArray(Integer arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer den[]={1,2,5,10,20,50,100,500,2000};
        int amt=591;
        ArrayList <Integer> count=new ArrayList<>();
        Arrays.sort(den,Comparator.reverseOrder());
        // printArray(den, den.length);
        for(int i=0; i<den.length; i++){
            while(amt>=den[i]){
                count.add(den[i]);
                amt-=den[i];
            }
        }
        System.out.println(count.toString());
    }
}
