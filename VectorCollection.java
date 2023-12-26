package CollectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();
        vector.add(12.365);
        vector.add(10.155);
        vector.add(42.3);
        vector.add(262.);
//        System.out.println(vector);
        Collections.sort(vector);
        for (Double d : vector){
            System.out.println(d);
        }
    }
}
