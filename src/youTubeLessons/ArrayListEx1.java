package youTubeLessons;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main (String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Evgen");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);//массив размером 200
        arrayList2.add("Evgen");
        arrayList2.add("Ivan"); //размер ArrayList = 2 т.к. два елемента

        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList1);





    }
}
