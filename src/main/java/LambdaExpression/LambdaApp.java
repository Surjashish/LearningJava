package LambdaExpression;

@FunctionalInterface
interface Cab {//interface having exactly 1 abstract method, we can call it functional interface. Also can optionally annotate

    //    void bookCac();
//    void bookCab(String source, String Destination);
    double bookCab(String source, String Destination);
}

//class UberX implements Cab{
//
//    @Override
//    public void bookCab() {
//        System.out.println("Uber booked, arriving soon!!");
//    }
//}
public class LambdaApp {

    int instanceVar=10;
    static int svar=100;


    public static void main(String[] args) {
//        Cab cab= new UberX(); //???   - polymorphic statement(Method 1)
//        cab.bookCab();


        //Anonymous Class implementation(Method 2)
//        Cab cab=new Cab() {
//            @Override
//            public void bookCab() {
//                System.out.println("Hello, the Ola cab is booked.");
//            }
//        };
//        cab.bookCab();


        //Method 3 - Using a lambda expression
//        Cab cab = (source, destination) -> {
//            System.out.println("Hello welcome to CGI from " + source + " to " + destination);
//            return 89823.23;
//        };
//        double fare=cab.bookCab("Rourkela", "Hyderabad");
//        System.out.println("Fare shall be "+fare );
        LambdaApp lambdaApp=new LambdaApp();
        double price=lambdaApp.cab.bookCab("Rourkela","Hyd");

    }

    Cab cab = (source, destination) -> {
        int localVar=100;
            System.out.println("Hello welcome to CGI from " + source + " to " + destination);
        System.out.println("instance var is "+instanceVar);
        System.out.println("static var is "+LambdaApp.svar);
        System.out.println("local var = "+localVar);
            return 89823.23;
        };
}
