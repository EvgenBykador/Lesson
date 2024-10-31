package task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //LinkedList - это двухсвязный список который реализует интерфейсы List и Deque
        //основное отличие- быстрая вставка и удаление в начало и конец. в середину тяжело.
        Deque<String> linkedList = new LinkedList<>();   //list-список, реализация -new LinkedList<>()

        linkedList.add("One");
        linkedList.addFirst("zero");
        linkedList.addLast("two");
        System.out.println(linkedList);
        System.out.println("**********************************************");


        //hashSet - это релизация множества set, который использует хеширование для хранения элементов
        //и его особбеннность-не допускает дубликатов,быстрый доступ к вставке,поиску и удалению блягодаря хешированию
        //и его минус - не гарантирует порядок

        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("one");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("One");
        System.out.println(hashSet);
        System.out.println("One".hashCode());
        System.out.println("one".hashCode());
        System.out.println("------------------------------------------------------");

        //Tree - это релизация множества set, который поддерживает множество элеменетов в отсортированном порядке
        //используется красно/черное дерево для хранения
        //не выводит дубликаты
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Lime");
        treeSet.add("Янтарь");
        treeSet.add("Алмаз");
        treeSet.add("Уголь");
        System.out.println(treeSet);
        System.out.println(treeSet.higher("Banana"));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
