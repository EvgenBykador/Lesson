package task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Инициализация кастомного списка
        CustomArrayList<String> myList = new CustomArrayList<>();

        // Инициализация стандартного списка для сравнения
        List<String> arrayList = new ArrayList<>();

        // Добавление элементов
        System.out.println("Adding elements to CustomArrayList:");
        myList.add("Hello");
        myList.add("World");
        myList.add("Java");

        System.out.println("Adding elements to ArrayList:");
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");

        // Вывод списка после добавления
        System.out.println("\nCustomArrayList: " + Arrays.toString(myList.toArray()));
        System.out.println("ArrayList: " + arrayList);

    }
}
