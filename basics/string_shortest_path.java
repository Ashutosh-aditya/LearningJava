public class string_shortest_path {
    public static void shortestPath(String str)
    {
        int x=0,y=0;
        for(int i=0;i<str.length();i++) 
        {
            if(str.charAt(i)=='N') y++;
            else if(str.charAt(i)=='S') y--;
            else if(str.charAt(i)=='E') x++;
            else if(str.charAt(i)=='W') x--;
        }
        System.out.println("Min Distance : "+Math.sqrt((x*x+y*y)));
    }
    public static void main(String[] args) {
        String str="WNEENESENNN",str1="NEWS";
        shortestPath(str);
        shortestPath(str1);
    }
}
