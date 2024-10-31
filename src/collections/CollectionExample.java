package collections;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("вишня");
        fruits.add("арбузик");
        fruits.add("яблоко");
        System.out.println(fruits);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        List<String> fruits2 = new LinkedList<>(); //обычно не используется на практике
        fruits2.add("яблоко");
        fruits2.add("вишня");
        fruits2.add("арбузик");
        fruits2.add("яблоко");
        System.out.println(fruits2);
        System.out.println("-----------------------------------------------------------");

        Set<String> fruits3 = new HashSet<>();//перевод как - набор, не допускает наличие дублей, но не сохраняет порядок добавления, произвольно выводит.
        fruits3.add("яблоко");
        fruits3.add("вишня");
        fruits3.add("арбузик");
        fruits3.add("яблоко");
        System.out.println(fruits3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Set<String> fruits4 = new LinkedHashSet<>();// не допускает наличие дублей, но Сохраняеет порядок добавления(как пишем так и выводит).
        fruits4.add("яблоко");
        fruits4.add("вишня");
        fruits4.add("арбузик");
        fruits4.add("яблоко");
        System.out.println(fruits4);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Set<String> fruits5 = new TreeSet<>();// сортирует элементы в алфавитном порядке
        fruits5.add("яблоко");
        fruits5.add("вишня");
        fruits5.add("арбузик");
        fruits5.add("яблоко");
        System.out.println(fruits5);
        System.out.println("------------------------------------------------------");

        Map<String, Integer> fruits6 = new HashMap<>();
        fruits6.putIfAbsent("яблоко", 6);
        fruits6.putIfAbsent("ананас",6);
        fruits6.putIfAbsent("вишня",5);
        fruits6.putIfAbsent("яблоко",4);
        System.out.println(fruits6);

        Map<String, Integer> fruits7 = new LinkedHashMap<>();
        fruits7.putIfAbsent("яблоко", 6);
        fruits7.putIfAbsent("ананас",6);
        fruits7.putIfAbsent("вишня",5);
        fruits7.putIfAbsent("яблоко",4);
        System.out.println(fruits7);

        Map<String, Integer> fruits8 = new TreeMap<>();
        fruits8.putIfAbsent("яблоко", 6);
        fruits8.putIfAbsent("ананас",6);
        fruits8.putIfAbsent("вишня",5);
        fruits8.putIfAbsent("яблоко",4);
        System.out.println(fruits8);


    }
}
