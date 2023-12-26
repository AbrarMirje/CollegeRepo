package CollectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollection {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(30);
        sortedSet.removeFirst();
        sortedSet.removeLast();
        sortedSet.add(500);
        for (Integer i : sortedSet){
            System.out.println(i);
        }
    }
}
