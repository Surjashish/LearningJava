package coreJava.Corejava;

class A
{
    public A() {
        System.out.println("in default const of A");

    }
    public A(int a)
    {
        System.out.println("In paratmeterized const of A");

    }
}
class B extends A
{
    public B() {
        System.out.println("in default const of B");

    }
    public B(int a)
    {
        super(a);
        System.out.println("In paratmeterized const of B");

    }
}
public class superMethod {
    public static void main(String[] args) {

        B b = new B(5);
    }
}
