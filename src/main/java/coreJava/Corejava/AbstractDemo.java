package coreJava.Corejava;

abstract class Writer {
    public abstract void write();
}

class Pen extends Writer {
    public void write() {
        System.out.println("I am a Pen");
    }
}

class Pencil extends Writer {
    public void write() {
        System.out.println("I am a Pencil");
    }
}

class Kit {
    public void doSomething(Writer p) {
        p.write();

    }
}


public class AbstractDemo {
    public static void main(String[] args) {

        Kit k = new Kit();
//        Pen p=new Pen();
//        Pencil pc=new Pencil();
//        k.doSomething(p);

        Writer p=new Pen(); //Reference is Writer, but object is of Pen
        Writer pc = new Pencil();

        k.doSomething(pc);


    }
}
