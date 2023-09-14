package java2023.day4;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q1 {
    public static void main(String[] args) {
        // Create a linked list with 5 million integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) {
            linkedList.add(i);
        }

        // Measure time using iterator
        long startTimeIterator = System.currentTimeMillis();
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTimeIterator = System.currentTimeMillis();
        long timeTakenIterator = endTimeIterator - startTimeIterator;
        System.out.println("Time taken using iterator: " + timeTakenIterator + " ms");

        // Measure time using get(index)
        long startTimeGet = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long endTimeGet = System.currentTimeMillis();
        long timeTakenGet = endTimeGet - startTimeGet;
        System.out.println("Time taken using get(index): " + timeTakenGet + " ms");
    }
}

