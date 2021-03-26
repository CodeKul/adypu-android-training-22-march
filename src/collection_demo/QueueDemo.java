package collection_demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        //FIFO

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.peek());
        System.out.println(queue.poll());//return null when queue is empty
        System.out.println(queue.peek());
        System.out.println(queue.remove());//return exception when queue is empty
    }
}
