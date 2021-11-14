package coreJava.HackerEarth;

public class Main {
    int a=9;
    int b=9;
    private int add()
    {
        return a+b;

    }
    int result()
    {
        return new Main().add();

    }

}
class Example3
{
    public static void main(String[] args) {
        Main e=new Main();
        System.out.println(e.result());
    }
}
