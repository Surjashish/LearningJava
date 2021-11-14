package coreJava.OverridingDemo;

class A
{
    public void show(){
        System.out.println("In class A");
    }
}
class B extends A{
    public void show1()
    {
        System.out.println("in B");
    }
    public  void show(){
        System.out.println(" overriding in B ");
    }
}
public class OverRidingDemo {
    public static void main(String[] args) {

        //Runtime polymorphism
        A obj=new B(); //Reference is A, object is B
        obj.show(); // works but obj.show1 wont work as class A doesnt know about show1

    }
}
