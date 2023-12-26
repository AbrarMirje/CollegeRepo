package CollectionFramework;

import java.util.HashSet;

public class SetCollection {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Abrar");
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Abrar");   //Duplicates are not allowed
//        System.out.println(hashSet);
        hashSet.remove("Python");
        for (String s : hashSet){
            System.out.println(s);
        }
    }
}
