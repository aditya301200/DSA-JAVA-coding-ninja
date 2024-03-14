package assignment2;

import java.util.LinkedList;
public class CollectionLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(); // Java collection class
        // add
        ll.addLast(1);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
