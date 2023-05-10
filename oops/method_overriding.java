public class method_overriding {
    public static void main(String[] args) {
        B b1 = new B();
        b1.fun();
    }
}

class A
{
    void fun()
    {
        System.out.println("Defined in Parent class");
    }
}

class B
{
    void fun()
    {
        System.out.println("Defined in Child class");
    }
}
