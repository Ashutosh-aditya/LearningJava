
// class abc {
//         int u;
//         String str;
//     abc()
//     {
        
//         System.out.println(str);
//     }
    
// }
public class one {
    static int y;
    one()
    {System.out.println("y1="+y);}
        public static void main(String[] args) {
        one a=new one();
        a.y=10;
        System.out.println(one.y); //aceess the static reference check it
        System.out.println("y="+y);
    }

}
