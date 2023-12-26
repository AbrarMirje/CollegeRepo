package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
//        System.out.println(linkedList);
        linkedList.remove(0);
        /*
            20
            30
            40
            50
         */
        linkedList.remove(1);
        /*
            20
            40
            50
         */

        Collections.reverse(linkedList);

        for (Integer i : linkedList){
            System.out.println(i);
        }
    }
}
