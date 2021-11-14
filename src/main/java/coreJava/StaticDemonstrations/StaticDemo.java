package coreJava.StaticDemonstrations;

class Emp
{
    int eid,salary;
//    String ceo;
    static String ceo;

    //Can also use the static block to initialize ceo, which will be same across all the employees;
    static
    {
        ceo="Surjashish";
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", salary=" + salary +
                ", ceo='" + ceo + '\'' +
                '}';
    }
}
public class StaticDemo {
    public static void main(String[] args) {

        Emp navin=new Emp();
        navin.eid=9;
        navin.salary=2000;
//        navin.ceo="Larry";
//        Emp.ceo="Larry";

        Emp rahul=new Emp();
        rahul.eid=10;
        rahul.salary=3000;
//        rahul.ceo="Larry";


        System.out.println(navin);
        System.out.println(rahul);



    }
}
