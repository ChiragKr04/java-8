import all_collections.lists.MyArrayList;
import all_collections.lists.MyLinkedList;
import all_collections.queues.MyQueue;

public class Main {
    public static void main(String[] args) {


        // ArrayList
        MyArrayList myArrayList = new MyArrayList();
//        new MyArrayList().insertValues();
//        new MyArrayList().checkSize();
//        myArrayList.stackOperation();

        // LinkedList
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.insertValues();

        // Priority Queue
        MyQueue myQueue = new MyQueue();
        myQueue.priorityQOp();
    }
}