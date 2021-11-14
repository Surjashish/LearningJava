package coreJava.DataStructures.LinkedList;

//Since they are in diff package , we can have our own method
public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }

            n.next = node;


        }

    }

    public void insertAtStart(int data) {
        Node node = head;
        Node datum = new Node();
        datum.data = data;
        head = datum;
        head.next = node;
    }

    public void insertAt(int index, int data) {
        Node node = head;
        Node datum = new Node(data);
        int actualIndex = 0;
        boolean isInserted = false;
        if (index == 0)
            insertAtStart(data);
        while (node.next != null) {

            if (actualIndex + 1 == index) {
                Node remaining = node.next;
                datum.next = remaining;
                node.next = datum;
                isInserted = true;
            }
            actualIndex++;
            node = node.next;

        }
        System.out.println(isInserted ? "successful" : "nt");
        show();

    }

    public void delete(int index) {
        int actualIndex = 0;
        Node ll = head;
        boolean isDelete=false;
        if (actualIndex == index) {
            head = head.next;


        } else {
            while (ll.next != null) {
                if (actualIndex + 1 == index) {
                    Node remaining = ll.next;
                    ll.next = remaining.next;
                    System.out.println("successfullxy deleted");
                    isDelete=true;
                    break;
                }
                ll = ll.next;
                actualIndex++;
            }
            System.out.println(isDelete?"deleted":"not deleted");
        }
        show();
    }

    public void show() {
        System.out.println("Printing the Linked List ...");
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
