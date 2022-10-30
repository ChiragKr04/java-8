package all_collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySets {

    // Hash Set
    // Stores unique value but not maintain the insertion order
    // O(1) for inset, remove, retrieve
    // Better performance than all other sets
    // equals() and hashCode() methods for comparing objects
    // One null value
    private Set<Integer> hashSet = new HashSet();

    // Linked Hash Set
    // Stores unique value but maintains the insertion order
    // O(1) for inset, remove, retrieve
    // Internally maintain the Linked List for insertion order
    // equals() and hashCode() methods for comparing objects
    // One null value
    private Set<Integer> linkedSet = new LinkedHashSet();

    // Tree Set
    // Stores unique value but maintains the insertion order
    // O(logN) for inset, remove, retrieve
    // More time because it needs to maintain the sorting
    // compare() and compareTo() methods to compare the objects
    // No null value
    private Set<Integer> treeSet = new TreeSet();

    public void hashSetOp() {
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(210);
        System.out.println(hashSet);
    }
    public void linkedHSetOp() {
        linkedSet.add(10);
        linkedSet.add(30);
        linkedSet.add(20);
        linkedSet.add(210);
        System.out.println(linkedSet);
    }
    public void treeHSetOp() {
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(210);
        System.out.println(treeSet);
    }

}
