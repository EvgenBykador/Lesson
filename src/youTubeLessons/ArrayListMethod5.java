package youTubeLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Evgen");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<Integer> list1 = List.of(3, 8, 13);        //нельзя модифицировать и не содержит элемент null
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);   //нельзя модифицировать и не содержит элемент null
        System.out.println(list2);

//        //sublist - включает в список элементы от и до
//        List<String> myList = arrayList1.subList(1, 4);
//        System.out.println(myList);

//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//        for(String s : array2) {
//            System.out.println(s);
//        }



//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Maria");
//        arrayList2.add("Igor");
//
////        //удаляем схожие элементы в arrayList1
////        arrayList1.removeAll(arrayList2);
////        System.out.println(arrayList1);
//
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//
//        //содержит ли arrayList1 все элементы arrayList2
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);


    }
}
