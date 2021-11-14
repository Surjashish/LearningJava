package coreJava.Objects;

class Calc
{
    int num1;
    void perform()
    {
        num1 =5;
    }
}
public class objectDemo {

    public static void main(String[] args) {
        Calc calc=new Calc();
        calc.num1=10;
        System.out.println(calc.num1);
        calc.perform();
        System.out.println(calc.num1);

        //check def values
        int[] a = new int[5];
        System.out.println(a[0]);
    }
}
