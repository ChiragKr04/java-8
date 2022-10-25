package all_collections.lists;

import all_collections.my_interfaces.CustomInterface;

import java.lang.reflect.Array;
import java.util.*;

public class MyArrayList implements CustomInterface {
    private ArrayList<Integer> currList = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
    private Vector<Integer> vectorArr = new Vector<>();
    private HashMap<String, String> hashMap = new HashMap<>();
    private Stack<Integer> stackArr = new Stack<>();



    public ArrayList<Integer> getCurrList() {
        return currList;
    }

    public void setCurrList(ArrayList<Integer> currList) {
        this.currList = currList;
    }

    public void insertValues(){
        List<Integer> list = Collections.synchronizedList(currList);
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

        for (int i = 0; i < currList.size(); i++) {
            System.out.println(currList.get(i).toString());
        }

        stackArr.push(10);

    }

}
