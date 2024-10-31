package task7;

import java.beans.PropertyEditorSupport;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Война и мир", "Лев Толстой", 1869, Genre.FICTION, 4.9));
        books.add(new Book("Детство", "Лев Толстой", 1852, Genre.FICTION, 4.4));

        books.add(new Book("Преступление и наказание", "Фёдор Достоевский", 1866, Genre.FICTION, 4.8)); // Дубликат
        books.add(new Book("Преступление и наказание", "Фёдор Достоевский", 1866, Genre.FICTION, 4.8)); // Дубликат
        books.add(new Book("Идиот", "Фёдор Достоевский", 1869, Genre.FICTION, 4.7));
        books.add(new Book("Братья Карамазовы", "Фёдор Достоевский", 1880, Genre.FICTION, 5.0));

        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, Genre.FANTASY, 4.7));
        books.add(new Book("Белая гвардия", "Михаил Булгаков", 1924, Genre.FICTION, 4.5));

//        books.add(new Book("Евгений Онегин", "Александр Пушкин", 1833, Genre.FICTION, 4.5));
        books.add(new Book("Пиковая дама", "Александр Пушкин", 1834, Genre.FICTION, 4.3));

        books.add(new Book("Три товарища", "Эрих Мария Ремарк", 1936, Genre.FICTION, 4.9));
        books.add(new Book("Триумфальная арка", "Эрих Мария Ремарк", 1945, Genre.FICTION, 4.7));

        books.add(new Book("451 градус по Фаренгейту", "Рэй Брэдбери", 1953, Genre.SCIENCE_FICTION, 4.7));
        books.add(new Book("Марсианские хроники", "Рэй Брэдбери", 1950, Genre.SCIENCE_FICTION, 4.6));

        books.add(new Book("Человек-невидимка", "Герберт Уэллс", 1897, Genre.SCIENCE_FICTION, 4.4));
        books.add(new Book("Война миров", "Герберт Уэллс", 1898, Genre.SCIENCE_FICTION, 4.6));

        books.add(new Book("Путешествие на край ночи", "Луи-Фердинанд Селин", 1932, Genre.FICTION, 4.3));
        books.add(new Book("Смерть в кредит", "Луи-Фердинанд Селин", 1936, Genre.FICTION, 4.2));

        books.add(new Book("Стив Джобс", "Уолтер Айзексон", 2011, Genre.BIOGRAPHY, 4.8));
        books.add(new Book("Эйнштейн: его жизнь и вселенная", "Уолтер Айзексон", 2007, Genre.BIOGRAPHY, 4.7));
    }

    public static void main(String[] args) {

//        Book book = new Book("Стив Джобс", "Уолтер Айзексон", 2011, Genre.NON_FICTION, 4.8);
//        Book book2 = new Book("Эйнштейн: его жизнь и вселенная", "Уолтер Айзексон", 2007, Genre.BIOGRAPHY, 2.7);
//

//        System.out.println(getAllAuthors(books));
//        System.out.println(getBooksPublishedAfterYear(books,2000));
//        System.out.println(findHighestRatedBook(books));
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(findHighestRatedBookWithStream(books));
//        System.out.println(getTotalNumberOfBooks(books));
//        System.out.println(doesBookExist(books, "Война миров"));
//        System.out.println("---------------------------");
//        System.out.println(doesBookExistWithStream(books,"Война  миров" ));
//        System.out.println(hasBooksOfGenre(books,Genre.EROTIC));
//        System.out.println(filterBooksByRatingRange(books,4.7, 5.0));
//        groupBooksByAuthor(books).forEach((k,v) -> System.out.println(k + " " + v));
//        countBooksByAuthor(books).forEach((k,v) -> System.out.println(k + " " + v));
//        groupBooksByGenre(books).forEach((k,v) -> System.out.println(k + " " + v));
//        countBooksByGenre(books).forEach((k,v) -> System.out.println(k + " " + v));
//        System.out.println(findOldestBook(books));
        System.out.println(findOldestBookWithStream(books));

    }

    //сделать группировку книг по авторам
    public static Map<String, List<Book>> groupBooksByAuthor(List<Book> books) {
        Map<String, List<Book>> result = new HashMap<>();
        for (Book book : books) {
            //Толстой
            String author = book.getAuthor();
            //здесь наш result еще пустой
           if (!result.containsKey(author)) {
               //добавляем в результ автора (как ключ и пустой список как значение)
               List<Book> emptyList = new ArrayList<>();
               result.put(author, emptyList);
           }
           //берем из результа по ключу (автор) лист книг этого автора
            List<Book> booksByAuthor = result.get(author);
           //в лист добавляем книгу этого автора
            booksByAuthor.add(book);
        }
        return result;
    }

    //метод возвращает количество книг у автора
    public static Map<String, Long> countBooksByAuthor(List<Book> books) {
        Map<String, Long> result = new HashMap<>(); // Толстой, 3к.
        for (Book book : books) {
            String author = book.getAuthor();
            if (!result.containsKey(author)) {
                result.put(author, 1L);
            } else {
                long countBooks = result.get(author);
                countBooks++;
                result.put(author, countBooks);
            }
        }
        return result;
    }

    //группировка книг по жанру                     DZ
    public static Map<Genre, List<Book>> groupBooksByGenre(List<Book> books) {
        Map<Genre, List<Book>> result = new HashMap<>();
        for(Book book : books) {
            Genre genre = book.getGenre();
            if (!result.containsKey(genre)) {
                List<Book> temp = new ArrayList<>();
                result.put(genre, temp);
            }
                List<Book> booksList = result.get(genre);
                booksList.add(book);
        }
        return result;
    }

    //подсчитать количество книг по жанру
    public static Map<Genre, Long> countBooksByGenre(List<Book> books) {
        Map<Genre, Long> result = new HashMap<>();
        for (Book book : books) {
            Genre genre = book.getGenre();
            if(!result.containsKey(genre)) {
                result.put(genre, 1L);
            } else {
                long countBooks = result.get(genre);
                countBooks++;
                result.put(genre, countBooks);
            }
        }
        return result;
    }



    /**
     * Метод проверяет, является ли книга бестселлером (рейтинг выше 4.8).
     *
     * @param book объект {@code Book}
     * @return строка "Бестселлер" или "Обычная книга" в зависимости от рейтинга.
     */
    public static String isBestseller(Book book) {
//        if (book.getRating()>=4.8) {
//            return "Бестселлер";
//        } else {
//            return "Обычная книга";
//        }
       return book.getRating()>=4.8 ? "Бестселлер" : "Обычная книга";

    }
    /**
     * Метод проверяет, является ли книга старой (год издания более 50 лет назад).
     *
     * @param book объект {@code Book}
     * @return строка "Старая книга" или "Современная книга".
     */
    public static String isOldBook(Book book) {
        int currentYear = 2024;
        if((currentYear - book.getYear()) >= 50) {
            return "Старая книга";
        } else {
            return "Книга современная";
        }
    }

    /**
     * Метод проверяет, является ли книга высокорейтинговой (рейтинг выше 4.5).
     *
     * @param book объект {@code Book}
     * @return строка "Высокий рейтинг" или "Средний рейтинг".
     */
    public static String hasHighRating(Book book) {
        return book.getRating()>=4.5 ? "Высокий рейтинг" : "Средний рейтинг";
    }

    /**
     * Метод проверяет, является ли название книги длинным (более 15 символов).
     *
     * @param book объект {@code Book}
     * @return строка "Длинное название" или "Короткое название".
     */
    public static String isLongTitle(Book book) {
//        if(book.getTitle().length()>=15) {
//            return "Длинное название";
//        }
//        return "Короткое название";
        return book.getTitle().length()>=15 ? "Длинное название" : "Короткое название";
    }

    /**
     * Метод проверяет, относится ли книга к научной литературе (жанр NON_FICTION или SCIENCE_FICTION).
     *
     * @param book объект {@code Book}
     * @return строка "Научная книга" или "Художественная книга".
     */
    public static String isScientific(Book book) {
        if (book.getGenre().equals(Genre.NON_FICTION)) {
            return "Научная книга";
        } else if (book.getGenre().equals(Genre.SCIENCE_FICTION)) {
            return "Художественная книга";
        }
        return "";
    }

    /**
     * Метод для поиска всех книг заданного автора.
     *
     * @param books  список книг
     * @param author автор для поиска
     * @return список книг данного автора
     */
    public static List<Book> findBooksByAuthor(List<Book> books, String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> findBooksByAuthorWithStream(List<Book> books, String author) {
    return  books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .toList();
    }


    /**
     * Метод для поиска всех книг определенного жанра.
     *
     * @param books список книг
     * @param genre жанр для поиска
     * @return список книг данного жанра
     */
    public static List<Book> findBooksByGenre(List<Book> books, Genre genre) {
        return null;
    }

    /**
     * Метод для поиска книги с самым высоким рейтингом.
     *
     * @param books список книг
     * @return книга с самым высоким рейтингом или {@code null}, если список пуст
     */
    public static Book findHighestRatedBook(List<Book> books) {
        Book result = null;
        for (int i = 0; i < books.size(); i++) {
            Book curentBook = books.get(i);
            if (i == 0) {
                result = curentBook;
            }
            else if (result.getRating() < curentBook.getRating()) {
                result = curentBook;
            }
        }
        return result;
    }

    public static Book findHighestRatedBookWithStream(List<Book> books) {
        return books.stream()
                .max(Comparator.comparing(Book::getRating))
                .orElse(null);
    }

    /**
     * Метод возвращает список всех названий книг.
     *
     * @param books список книг
     * @return список строк с названиями всех книг
     */

            //List<String> - Возращаем!!!!!!!     (List<Book> books) - принимаем!!!!!!!
    public static List<String> getAllBookTitles(List<Book> books) {
        List<String> resultTitles = new ArrayList<>();

        for (Book book : books) {
            String title = book.getTitle();
            resultTitles.add(title);

        }
        return resultTitles;
    }

    public static List<String> getAllBookTitlesWithStream(List<Book> books) {
        return books.stream()
//                .map(book -> book.getTitle())
                .map(Book::getTitle)
                .toList();
    }

    /**
     * Метод возвращает общее количество книг в списке.
     *
     * @param books список книг
     * @return общее количество книг
     */
    public static int getTotalNumberOfBooks(List<Book> books) {
        return books.size();
    }

    /**
     * Метод проверяет, существует ли книга с заданным названием.
     *
     * @param books список книг
     * @param title название книги для поиска
     * @return {@code true}, если книга с таким названием существует, иначе {@code false}
     */
    public static boolean doesBookExist(List<Book> books, String title) {

        for (Book book : books) {
            String actualTitle = book.getTitle();
            if (actualTitle.equals(title)) {
              return true;
            }
        }
        return false;
    }

    public static boolean doesBookExistWithStream(List<Book> books, String title) {
        return books.stream()
                .anyMatch(book -> book.getTitle().equals(title));
    }


    /**
     * Метод возвращает список всех авторов книг.
     *
     * @param books список книг
     * @return список строк с именами авторов
     */
    public static List<String> getAllAuthors(List<Book> books) {
        List<String> resultAuthor = new ArrayList<>();
//        for (int i = 0; i < books.size(); i++) {
//            System.out.println(books.get(i));
//        }
        for (Book book : books) {
            String author = book.getAuthor();
            resultAuthor.add(author);
        }
    return resultAuthor;
    }

    public static List<String> getAllAuthorsWithStream(List<Book> books) {
        return books.stream()
                .map(book -> book.getAuthor())
                .toList();
    }

    /**
     * Метод проверяет, есть ли в списке книги определенного жанра.
     *
     * @param books список книг
     * @param genre жанр для проверки
     * @return {@code true}, если в списке есть книги данного жанра, иначе {@code false}
     */
    public static boolean hasBooksOfGenre(List<Book> books, Genre genre) {
        for (Book book : books) {
            Genre actualGenre = book.getGenre();
            if (actualGenre==genre) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasBooksOfGenreWithStream(List<Book> books, Genre genre) {
        return books.stream()
                .anyMatch(book -> book.getGenre() == genre);
    }


    /**
     * Метод возвращает список книг, изданных после определенного года.
     *
     * @param books список книг
     * @param year год для фильтрации
     * @return список книг, изданных после указанного года
     */
    public static List<Book> getBooksPublishedAfterYear(List<Book> books, int year) {
        return books.stream()
                .filter(book -> book.getYear()>year)
                .collect(Collectors.toList());
    }

    /**
     * Метод возвращает самую старую книгу (с минимальным годом издания).
     *
     * @param books список книг
     * @return книга с минимальным годом издания или {@code null}, если список пуст
     */
    public static Book findOldestBook(List<Book> books) {
        if (books.isEmpty()) {
            return null;
        }
//        Book result = books.get(0);             //объект типа Book
        Book result = null;
        int year = 2025;
        for (Book book : books) {

            //1500 > 1400
            //если (самая старая > 1-ой книги из списка
           if (year > book.getYear()) {
                result = book;
                year = book.getYear();
                }
           }
        return result;
    }
    public static Book findOldestBookWithStream(List<Book> books) {
        return books.stream()
                .min(Comparator.comparing(Book::getYear))
                .orElse(null);
    }
//
//            return books.stream()
//                    .max(Comparator.comparing(Book::getRating))
//            .orElse(null);

    /**
     * Метод возвращает список книг с рейтингом в заданном диапазоне.
     *
     * @param books список книг
     * @param minRating минимальный рейтинг
     * @param maxRating максимальный рейтинг
     * @return список книг, у которых рейтинг находится в заданном диапазоне
     */
    public static List<Book> filterBooksByRatingRange(List<Book> books, double minRating, double maxRating) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            double rating = book.getRating();
            if (rating > minRating && rating < maxRating) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Метод возвращает список книг, где каждый автор представлен только одной книгой.
     *
     * @param books список книг
     * @return список книг с уникальными авторами
     */
    public static List<Book> getBooksWithUniqueAuthors(List<Book> books) {
        return null;
    }
}
