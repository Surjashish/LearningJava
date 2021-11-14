package coreJava.Exceptions;

class MyException extends Exception{
    MyException()
    {
        System.out.println("User defined Exception occured");
    }
}
public class UserDefException {
    public static void main(String[] args) throws MyException{
        try {
            for (int i=0;i<10;i++)
            {
                if (i==5)
                    throw new MyException();
                else System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("User Defined Exception demonstrated");
        }
    }



}















