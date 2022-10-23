package all_collections.lists;

import all_collections.my_interfaces.CustomInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MyArrayList implements CustomInterface {
    private ArrayList<Integer> currList = new ArrayList<>();
    HashMap<String, String> hashMap = new HashMap<>();

    public ArrayList<Integer> getCurrList() {
        return currList;
    }

    public void setCurrList(ArrayList<Integer> currList) {
        this.currList = currList;
    }

    public void insertValues(){
        currList.ensureCapacity(100);
        currList.add(10);
        currList.add(20);
        currList.add(30);
        currList.add(40);
        currList.add(50);
        Iterator it = currList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
