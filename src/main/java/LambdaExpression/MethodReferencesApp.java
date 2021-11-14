package LambdaExpression;


interface Calculator{
    void add(int n1,int n2);
}
class Calc{
    public static void addSomething(int num1,int num2)
    {
        System.out.println("sum "+(num1+num2));
    }
    public void letsAdd(int num1,int num2)
    {
        System.out.println("sum "+(num1+num2));
    }
}

//Functional Interface
interface Messenger{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.println(">>Message "+msg);
    }
}
public class MethodReferencesApp {
    public static void main(String[] args) {
        //Calc.addSomething(10,20);

        //1. Referencing a static method
//        Calculator cRef=Calc::addSomething; // Method Reference
//        cRef.add(11,14);

        //2. Reference to a non static method or instance method
//        Calc calc=new Calc();
//        Calculator cRef=calc::letsAdd;
//        cRef.add(11,14);

        //3. Reference to a constructor
        Messenger mRef=Message::new;
//        mRef.getMessage("Hello Surjashish");



    }
}
