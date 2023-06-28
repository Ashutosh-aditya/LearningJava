import java.util.*;

public class max_water_problem {
    public static void main(String[] args) {
        // int height[] ={1,8,6,2,5,4,8,3,7};
        ArrayList <Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(height);
        // System.out.println(Arrays.asList(1,8,6,2,5,4,8,3,7));
        // System.out.println(height.get(1).getClass());
        // System.out.println(height.get(1) instanceof Integer);
        Integer begin=0,end=height.size()-1,maxW=0;
        while(begin<end)
        {
            Integer w=end-begin,h=Math.min(height.get(begin), height.get(end)),max=0;
            max=h*w;
            maxW=Math.max(max, maxW);
            if(height.get(begin)>height.get(end)){
                end--;
            }
            else {
                begin++;
            }
        }
        System.out.println(maxW);
    }
}
