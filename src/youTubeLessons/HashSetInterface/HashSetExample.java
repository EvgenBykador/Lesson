package youTubeLessons.HashSetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String > set = new HashSet<>();
        set.add("Evgen");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);
//        set.remove("Evgen");
//        System.out.println(set);
        for(String s : set) {
            System.out.println(s);
        }
//        System.out.println(set.size());
        System.out.println(set.isEmpty()); // пустая ли коллекция
        System.out.println(set.contains("Evgen"));     //есть ли такой элемент в нашем множестве

    }
}
