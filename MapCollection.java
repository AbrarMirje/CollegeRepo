package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Abrar", 58);
        map.put("Java", 1996);
        map.put("Kolhapur", 9);
//        map.remove("Java");
//        map.clear();
//        System.out.println(map);
        for (Map.Entry<String, Integer> m : map.entrySet()){
            System.out.print(m.getKey() + " : " );
            System.out.println(m.getValue());
        }
    }
}
