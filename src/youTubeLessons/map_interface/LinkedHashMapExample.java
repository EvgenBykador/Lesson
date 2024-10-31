package youTubeLessons.map_interface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, StudentTree> lhm =
                new LinkedHashMap<>(16, 0.75f, true);
        StudentTree st1 = new StudentTree("Evgen", "Bykador", 3);
        StudentTree st2 = new StudentTree("Mariya", "Belova", 1);
        StudentTree st3 = new StudentTree("Sergey", "Petrov", 4);
        StudentTree st4 = new StudentTree("Igor", "Sidorov", 4);

        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        System.out.println(lhm);

        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);
    }
    }


