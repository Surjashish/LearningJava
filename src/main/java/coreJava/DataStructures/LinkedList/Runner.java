package coreJava.DataStructures.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(7);
        list.insert(22);
        list.show();
        list.insertAtStart(0);
        list.show();
        list.insertAt(0,569);
        list.delete(2);
    }

}
