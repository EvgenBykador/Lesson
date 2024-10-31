package task8;

import task7.Book;
import task7.Genre;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alisa", "Bob", "Anna", "Tom", "Anna");
//        List<String> a = names.stream()
//                .filter(n -> n.startsWith("A"))
//                .collect(Collectors.toList());
//        System.out.println(a);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Война и мир", "Лев Толстой", 1869, Genre.FICTION, 4.9));
        books.add(new Book("Детство", "Лев Толстой", 1852, Genre.FICTION, 4.4));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, Genre.FANTASY, 4.7));
        books.add(new Book("Белая гвардия", "Михаил Булгаков", 1924, Genre.FICTION, 4.5));


        //метод фильтров
//        List<Book> b = books.stream()
//                .filter(book -> book.getYear()>1860)
//                .toList();
//        System.out.println(b);

//        //вывести названия книг
//        List<String> b = books.stream()
//                .map(book -> book.getTitle())
//                .toList();
//        System.out.println(b);

//        //все большими буквами
//        List<String> n = names.stream()
//                .map(s -> s.toUpperCase())
//                .toList();
//        System.out.println(n);

//        names.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

//        books.stream()
//        .map(book -> 2024 - book.getYear())
//                .forEach(y -> System.out.println(y));

//        books.stream()
//                .map(book -> 2024 - book.getYear())
//                .forEach(System.out::println);

//       String title = books.stream()
//                .map(b->b.getTitle())
//                .collect(Collectors.joining(", "));
//        System.out.println(title);

//        String title = books.stream()
//                .map(Book::getTitle)
//                .collect(Collectors.joining(", "));
//        System.out.println(title);

//        //сортировка
//        names.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

//        books.stream()
//                .sorted(Comparator.comparing(Book::getYear).reversed())
//                .forEach(System.out::println);

//        books.stream()
//                .sorted(Comparator.comparing(book -> book.getYear()).reversed())
//                .forEach(System.out::println);

//        //удаление дубликата
//        names.stream()
//                .distinct()
//                .forEach(System.out::println);

//            //удаление дубликата
//            books.stream()
//                    .map(Book::getAuthor)
//                    .distinct()
//                    .forEach(System.out::println);

//        names.stream()
//                .limit(2)
//                .forEach(System.out::println);

//       //сортировка по возрасту
//        books.stream()
//                .sorted(Comparator.comparing(book -> book.getYear()))
//                .limit(2)
//                .forEach(System.out::println);

    }
}
