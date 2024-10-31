package task7;

import java.util.Objects;

public class Book {
    /** Название книги */
    private String title;
    /** Автор книги */
    private String author;
    /** Год издания */
    private int year;
    /** Жанр книги (перечисление Genre) */
    private Genre genre;
    /** Рейтинг книги (от 0 до 5) */
    private double rating;

    public Book(String title, String author, int year, Genre genre, double rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please enter a value between 0 and 5.");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }

    /**
     * Метод для сравнения книг по рейтингу.
     *
     * @param other другая книга для сравнения
     * @return {@code true}, если текущая книга имеет более высокий рейтинг; {@code false} в противном случае
     */
    public boolean hasHigherRatingThan(Book other) {
        return this.rating > other.rating;
    }

    /**
     * Метод для сравнения книг по году издания.
     *
     * @param other другая книга для сравнения
     * @return {@code true}, если текущая книга более новая; {@code false} в противном случае
     */
    public boolean isNewerThan(Book other) {
        return this.year > other.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Double.compare(rating, book.rating) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, genre, rating);
    }
}
