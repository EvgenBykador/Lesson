package youTubeLessons;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethod4 {
    public static void main(String[] args) {

        //создадим несколько объектов StringBuilder
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        //создаеи массив StringBuilder
        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        //после, создаем списоk (List)содержащий StringBuilder, используя класс Arrays.asList(array)
        //и c помощью метода asList получаем лист из массива (array)
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);
        array[0] = new StringBuilder("F");
        System.out.println(list);



    }
}
