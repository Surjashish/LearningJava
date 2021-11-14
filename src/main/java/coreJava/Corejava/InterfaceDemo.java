//package coreJava.Corejava;
//
//interface Writer {
//    public abstract void write();
//}
//
//class Pen implements coreJava.Writer {
//    public void write() {
//        System.out.println("I am a Pen");
//    }
//}
//
////class Pencil implements coreJava.Writer {
//    public void write() {
//        System.out.println("I am a Pencil");
//    }
//}
//
//class Kit {
//    public void doSomething(coreJava.Writer p) {
//        p.write();
//
//    }
//}
//
//public class InterfaceDemo {
//    public static void main(String[] args) {
//
//        coreJava.Kit k = new coreJava.Kit();
////        Pen p=new Pen();
////        Pencil pc=new Pencil();
////        k.doSomething(p);
//
//        coreJava.Writer p=new coreJava.Pen(); //Reference is interface Writer, but object is of Pen
//        coreJava.Writer pc = new coreJava.Pencil();
//
//        k.doSomething(pc);
//
//
//    }
//}
