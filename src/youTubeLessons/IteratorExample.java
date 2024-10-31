package youTubeLessons;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Evgen");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Ivan");

        Iterator<String> iterator = arrayList1.iterator();      //iterator -это повторитель
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
