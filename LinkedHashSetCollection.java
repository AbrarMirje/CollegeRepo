package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.remove(20);
        for (Integer i : linkedHashSet)
            System.out.println(i);
    }
}
