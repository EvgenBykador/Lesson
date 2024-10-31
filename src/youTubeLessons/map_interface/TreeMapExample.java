package youTubeLessons.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, StudentTree> treeMap = new TreeMap<>();
        StudentTree st1 = new StudentTree("Evgen", "Bykador", 3);
        StudentTree st2 = new StudentTree("Mariya", "Belova", 1);
        StudentTree st3 = new StudentTree("Sergey", "Petrov", 4);
        StudentTree st4 = new StudentTree("Igor", "Sidorov", 4);
        StudentTree st5 = new StudentTree("Vasiliy", "Smirnov", 4);
        StudentTree st6 = new StudentTree("Sasha", "Kapustin", 4);
        StudentTree st7 = new StudentTree("Elena", "Poleno", 4);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);

        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.4));
//        System.out.println(treeMap.remove(7.2));
    }
}
