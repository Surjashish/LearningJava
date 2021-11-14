package coreJava.Corejava;


class A2
{
    public void show()
    {
        System.out.println("in A show ");

    }
}
class B2 extends A2{
    public void show()
    {
        System.out.println("surjashish is the best");
    }
}
public class AnonymousExample {
    public static void main(String[] args) {

        //Anonymous class
        A2 obj=new A2(){
            public void show()
            {
                System.out.println("i am the best");
            }
        };
        obj.show();

        //Normal method
        A2 obj2 = new B2();
        obj2.show();
    }
}
