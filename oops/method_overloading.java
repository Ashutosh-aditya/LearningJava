public class method_overloading {
    public static void main(String[] args) {
        cal c1=new cal();
        System.out.println(c1.sum(50, 40));
        System.out.println(c1.sum(50.5f, 40.5f));
        System.out.println(c1.sum(50, 40,100));
    }
}

class cal 
{
    int sum(int a,int b) {return (a+b);}
    int sum(int a,int b,int c) {return (a+b+c);}
    float sum(float a,float b) {return (a+b);}

}
