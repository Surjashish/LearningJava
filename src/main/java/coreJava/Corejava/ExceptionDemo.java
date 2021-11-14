package coreJava.Corejava;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a[]=new int[6];
            a[8]=8;
            int i=7;
            int j=0;
            int k=i/j;
            System.out.println("output is "+k);


        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error "+e);
        }
        catch (Exception e)
        {System.out.println("Error "+e);}
        finally {
            System.out.println("Bye");

        }
    }
}
