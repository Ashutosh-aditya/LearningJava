import java.util.Stack;

public class Q8_Max_Histogram {
    public static void max_Area(int arr[]){
        int maxArea=0,n=arr.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        Stack <Integer> s =new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }
            else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else {
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<n;i++){
            int height=arr[i];
            int weidth = nsr[i]-nsl[i]-1;
            int curArea=height*weidth;
            maxArea=Math.max(curArea,maxArea);
        }
        System.out.println("Max Area is : "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        max_Area(arr);
    }
}
