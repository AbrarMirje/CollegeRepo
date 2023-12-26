package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
//        Adding object in ArrayList
        names.add("Abrar");
        names.add("Java");
        names.add("JavaScript");
        names.add("Python");
        names.add("Go");
//        System.out.println(names.size());
        names.removeFirst();
//      Removing object from the ArrayList
//        names.remove("Go");
        names.remove(names.size() - 4);

//        Collections.sort(names);

        for (String s : names){
            System.out.println(s);
        }
    }
}
