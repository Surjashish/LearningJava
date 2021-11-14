package coreJava.Corejava;

class X{
    public void show(){
        System.out.println("in X");
    }
}
class Y extends X
{
    public void show(){
        System.out.println("in Y");

    }
}
class Z extends X{
    public void show(){
        System.out.println("in Z");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        X myObj=new Y();//runtime Polymorphism
        myObj.show();

        myObj=new Z();
        myObj.show(); //Dynamic Method Dispatch
    }
}
