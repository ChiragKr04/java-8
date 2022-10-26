package all_collections.lists;

import all_collections.my_interfaces.CustomInterface;

import java.util.*;

public class MyArrayList implements CustomInterface {

    /// Array List
    /// - Internally uses static array
    /// - It is not synchronised List.
    /// - It increased its size by 50% of actual size
    /// - Faster than Vector because it is not thread safe
    /// - Iterator -> Collection -> AbstractList(class) -> List(interface), RandomAccess -> ArrayList
    /// - Came after Vector in java version 1.2
    private ArrayList<Integer> currList = new ArrayList<>();

    /// Vector Array
    /// - Internally uses static array
    /// - It is synchronised List. All its methods and variable are thread safe.
    /// - It increased its size by double of actual size
    /// - Slower than arraylist cause of thread safe
    /// - Iterator -> Collection -> AbstractList(class) -> List(interface) -> Vector
    /// - Came in java version 1.0 before ArrayList

    private Vector<Integer> vectorArr = new Vector<>();

    /// Stack
    /// - Internally uses static array
    /// - All its methods and variables are synchronised in nature.
    /// - It extends Vector class
    /// - It increased its size same as Vector because it extends Vector
    /// - Iterator -> Collection -> AbstractList(class) -> List(interface) -> Vector(class) -> Stack
    /// - Came in java version 1.0 along with Vector
    private Stack<Integer> stackArr = new Stack<>();

    /// Why [Stack] and [Vector] are synchronised in nature ?
    /// - To run old version of java code or running the code where collections are not introduced.
    /// - Java rushed to market causes poorly written Vectors and stack which are synchronous
    /// - Later found out it drops performance then collections came out
    /// - We can still make all the new collections "Synchronised" using [Collections.synchronizedCollection(collectionName)]

    public ArrayList<Integer> getCurrList() {
        return currList;
    }

    public void setCurrList(ArrayList<Integer> currList) {
        this.currList = currList;
    }

    public void insertValues() {

        // Explicitly converting ArrayList into a Synchronised ArrayList
        List<Integer> list = Collections.synchronizedList(currList);


        /// Explicitly giving size to ArrayList
        /// Only increases the memory size not the actual indexes
        currList.ensureCapacity(100);

        currList.add(10);
        currList.add(20);
        currList.add(30);
        currList.add(40);
        currList.add(50);

        ///
        vectorArr.add(100);

        Iterator it = currList.iterator();

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

//        for (int i = 0; i < currList.size(); i++) {
//            System.out.println(currList.get(i).toString());
//        }

        stackArr.push(10);
        stackArr.push(20);
        stackArr.push(50);


    }

    public void checkSize() {
        for (int i = 0; i < 12; i++) {
            currList.add(i);
        }
        Object[] narr = currList.toArray();
        narr[13] = 80;
        System.out.println(narr[13]);
    }

}
