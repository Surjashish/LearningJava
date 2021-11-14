package coreJava.teluskoTutorials;

class Emp
{
    int eId;
    int salary;
    static String ceo; //static keyword - same for all objects and initialized when class is loaded in class loader of JVM.

    @Override
    public String toString() {
        return "Emp{" +
                "eId=" + eId +
                ", salary=" + salary +
                '}';
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Emp navin = new Emp();
        navin.eId=2;
        navin.salary=4000;
        Emp.ceo="Surjashish";
        System.out.println(navin.toString());
    }
}
