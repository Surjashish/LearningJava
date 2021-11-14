package Elite;

@FunctionalInterface
interface Abc
{
    void sum(int a,int b);
    default Integer gggg()
    {
        return 2323;
    }
    static Integer sss()
    {
        return 222;
    }
}
class FunctionalWithLambda {

    public static void main(String[] args) {
        Abc obj = (a,  b) -> System.out.println(a+b);


        obj.sum(5,3);
        Abc.sss();
    }



}

