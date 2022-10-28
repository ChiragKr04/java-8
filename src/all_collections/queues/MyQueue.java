package all_collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

public class MyQueue{

    /// Priority Queue
    /// - When we add elements into PQ it stores in linear order
    /// - But at the time of removal it removes in sorted fashion
    private Queue<Integer> priorityQueue = new PriorityQueue<>();
    private Queue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>(10);

    /// BlockingQ are simple Queue follows FIFO
    /// Removing from BQ will be done in FIFO manner not in sorted manner
    private Queue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
    private Queue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(10);

    /// Deque
    /// It is double ended Queue
    /// removal and insertion from both ends
    private Deque<Integer> deque = new ArrayDeque<>();

    /// Use when only single thread needs to access the data (single lock)
    /// Only one thread can access at same time
    /// Thread safe
    /// It uses lock.lock() inside its data manipulation methods
    private Deque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<>();

    /// Use when multiple thread needs to access the data (lock-free)
    /// Multiple thread can access at same time
    /// Thread safe
    private Deque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();

    public void priorityQOp() {
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(5);

        System.out.println(priorityQueue);

        int size = priorityQueue.size();
        /// Removing elements
        for (int i = 0; i < size; i++) {
            // Removing element from PQ using `poll()`
            System.out.println(priorityQueue.poll());
        }
    }

    public void blockingQOp() {

//        for (int i = 0; i < 15; i++) {
//
//            // Using .add() with BlockingQ will produce error if it reaches the max limit which we have given
////            blockingQueue.add(i);
//
//            // To counter .add() we can use .offer() it does the same thing as .add()
//            // but it handles the queue overflow error if we are trying to add more element than capacity given
//            // returns true if element added in blockingQ else false
////            System.out.println(blockingQueue.offer(i));
//            blockingQueue.offer(i);
//        }


        blockingQueue.add(10);
        blockingQueue.add(50);
        blockingQueue.add(20);
        blockingQueue.add(5);

        System.out.println(blockingQueue);

        int size = blockingQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(blockingQueue.poll());
        }
    }

    public void dequeOp() {
        deque.add(10);
        deque.add(80);
        deque.add(40);
        deque.add(20);
        deque.add(90);
        deque.add(30);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
//        System.out.println(deque.removeFirstOccurrence(5));
        System.out.println(deque.pollFirst());

    }

}
