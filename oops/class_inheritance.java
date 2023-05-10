public class class_inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.height=0.2f;
        f1.weight=.05f;
        f1.fins=5;
        f1.get_height();
        f1.get_weight();
        System.out.println(f1.fins);
        System.out.println(f1);
    }

}
class Animal
{
    float height,weight;
    void get_height()
    {
        System.out.println("Height is " + height);
    }
    void get_weight()
    {
        System.out.println("Weight is : "+weight);
    }
}

class Fish extends Animal
{
    int fins;
}