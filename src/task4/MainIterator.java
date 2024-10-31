package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //array - релизация
        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }
//        for (String elemet : list) {
//            System.out.println(elemet);
//        }
//        System.out.println("***********************************");
//
//        for (Iterator<String> it = list.iterator(); it.hasNext();) {
//            String next = it.next();
//            System.out.println(next);
//        }

        //ConcurrentModificationException
//        for (String element : list) {
//            list.add("For");
//            System.out.println(element);
//        }

        //способ избежать ошибки-ConcurrentModificationException при добавлении в колекцию
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equalsIgnoreCase("Three")) {
//                list.add("Four");
//            }
//        }
////        System.out.println(list);

        //способ избежать ошибки-ConcurrentModificationException при удалении в колекции
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            if (element.equalsIgnoreCase("Two")) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);

//        //стрелочная функция
//        list.forEach(element -> System.out.println(element));

//        list.forEach(System.out::println);
    }
}
