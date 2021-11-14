package coreJava.MultiThreading;

//class Hi implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("HI ");
//            try {
//                Thread.sleep(1000); //lets say this method takes 5 seconds to do, but we want our other processor work at that time as well
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


class Hello implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {
        System.out.println("sefesfse");
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {

//        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello(); //Reference is of Runnable and type is of hello. BTW , obj2.print() cannot be called.

        //Instead of above, we can use anonymous class

        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("HI ");
                try {
                    Thread.sleep(1000); //lets say this method takes 5 seconds to do, but we want our other processor work at that time as well
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


//        obj1.start(); // internally Thread executes a run method, hence instead of calling the show method, we need to call the run method.
//
//        Thread.sleep(10);
//        obj2.start();

        //start method wont work simply with Runnable interface.

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        Thread.sleep(10);
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Bye "); // It gets executed by main thread. After t1, in the 10 ms pause for t2, main thread executes this. so we need to use t1.join;

    }
}
