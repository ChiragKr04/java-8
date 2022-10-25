package all_collections.lists;

import all_collections.my_interfaces.CustomInterface;

import java.util.LinkedList;

public class MyLinkedList implements CustomInterface {
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
        for (String s : currLList) {
            System.out.println(s);
        }
    }
}
