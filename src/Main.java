import all_collections.lists.MyArrayList;
import all_collections.lists.MyLinkedList;
import all_collections.maps.MyMaps;
import all_collections.queues.MyDelayQOperation;
import all_collections.queues.MyQueue;
import all_collections.sets.MySets;

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
//        myQueue.priorityQOp();
//        myQueue.blockingQOp();

        // Delay Queue
//        MyDelayQOperation myDelayQ = new MyDelayQOperation();
//        myDelayQ.delayOperation();

        // Sets
        MySets mySets = new MySets();
//        mySets.hashSetOp();
//        mySets.linkedHSetOp();
//        mySets.treeHSetOp();

        // Hash Map
        MyMaps myMaps = new MyMaps();
        myMaps.hashMapOp();
        myMaps.linkedHashMapOp();
        myMaps.treeMapOp();

    }
}