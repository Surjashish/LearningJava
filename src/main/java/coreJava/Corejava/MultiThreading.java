package coreJava.Corejava;

class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

class Hello implements Runnable {
    public void run() // run method needs to be overridden from Thread class
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1,"Hi Thread");
        Thread t2 = new Thread(obj2,"Hello Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        System.out.println(t1.isAlive());

        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye ");

    }
}
