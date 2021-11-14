package DataStructures.BinaryTree.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(2);
        integerQueue.add(34);
        integerQueue.add(654);
        integerQueue.add(4);
        integerQueue.poll();
        integerQueue.poll();

        System.out.println(integerQueue);
    }
}
