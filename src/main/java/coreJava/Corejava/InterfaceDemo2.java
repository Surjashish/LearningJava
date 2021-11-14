package coreJava.Corejava;

interface Abc
{
    void show();
}

class implementor implements Abc
{

    @Override
    public void show() {
        System.out.println("Anything ");
    }
}
public class InterfaceDemo2 {

    public static void main(String[] args) {

        Abc obj =new implementor(); //Reference of interface Abc and object of implementor class
        obj.show();
    }
}
