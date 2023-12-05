//this  keyword is a reference variable which refers to the current object class
//super keyword is a reference variable which refers to the immediate parent object class

class A
{
    int a =10;
}
class B extends A
{
    int a= 20;
    public void show(int a)
    {
        System.out.println("The value of a is using method:"+a);
        System.out.println("The value of a using thi keyword:"+this.a);
        System.out.println("The value of a using Super Keyword:"+super.a);
    }
}
public class Keyword
{
    public static void main(String[] args)
    {
        B b= new B();
        b.show(30);
    }
}