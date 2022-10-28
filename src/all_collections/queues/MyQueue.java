package all_collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {

    /// Priority Queue
    /// - It follows FIFO principle
    /// - When we add elements into PQ it stores in linear order
    /// - But at the time of removal it removes in sorted fashion
    private Queue<Integer> priorityQueue = new PriorityQueue<>();

    public void priorityQOp() {
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(5);
        priorityQueue.offer(30);

        System.out.println(priorityQueue);

        /// Removing elements
        for (int i = 0; i < priorityQueue.size(); i++) {
            // Removing element from PQ using `poll()`
            System.out.println(priorityQueue.poll());
        }
    }

}
