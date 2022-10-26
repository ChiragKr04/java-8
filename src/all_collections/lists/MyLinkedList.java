package all_collections.lists;

import all_collections.my_interfaces.CustomInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList implements CustomInterface {
    /// Linked List
    /// - It is not thread safe.
    /// - It's size is always empty when initialised
    /// - It creates single-single blocks of memory at runtime
    /// - It is sequential in nature
    /// - It is double linked list we can iterate from both ends.
    /// - Contains [.descendingIterator()] using this we can iterate from behind.
    /// - Iterator -> Collection -> AbstractSequentialList(class) -> List(interface), Deque(interface) -> ArrayList
    private LinkedList<String> currLList = new LinkedList<>();

    public LinkedList<String> getCurrLList() {
        return currLList;
    }

    public void setCurrLList(LinkedList<String> currLList) {
        this.currLList = currLList;
    }

    public void insertValues() {
        currLList.add("a");
        currLList.add("b");
        currLList.add("c");
        currLList.add("d");
        currLList.add("e");

//        for (String s : currLList) {
//            System.out.println(s);
//        }

        /// Reverse iteration on LinkedList
        Iterator it = currLList.descendingIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
