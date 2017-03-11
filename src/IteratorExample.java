/**
 * Created by Dave on 3/10/17.
 */

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        // construct a linked list
        LinkedList<String> thisIsALinkedList = new LinkedList<>();

        //add some stuff to the linked list
        thisIsALinkedList.add("Katie");
        thisIsALinkedList.add("Kent");
        thisIsALinkedList.add("Julia");
        thisIsALinkedList.add("Jason");

        // create an iterator
        Iterator iterator = thisIsALinkedList.iterator();

        System.out.println("Kids I like the most");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("ArrayList Forward Example");

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            integerArrayList.add(i * i);
        }

        Iterator it = integerArrayList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        int lastElement = integerArrayList.size();

        // list iterator has more methods than a regular iterator
        ListIterator<Integer> listIterator = integerArrayList.listIterator(lastElement);
        // start the listIterator at the last element so we can use hasPrevious

        System.out.println("ArrayList Backward Example");

        // print arrayList in reverse
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}


