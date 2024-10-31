package task10;

public class CustomArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public CustomArrayList() {
        elements = new Object[10];
    }

    // Метод для добавления элемента в конец списка
    public void add(E e) {
        elements[0] = e;
    }

    // Метод для получения элемента по индексу
    public E get(int index) {
        return (E) null;
    }

    // Метод для удаления элемента по индексу
    public E remove(int index) {
        return null;
    }

    // Метод для получения текущего количества элементов
    public int size() {
        return 0;
    }

    // Метод для проверки, пуст ли список
    public boolean isEmpty() {
        return false;
    }

    // Метод для очистки списка
    public void clear() {
    }

    // Метод для замены элемента по индексу
    public E set(int index, E element) {
        return null;
    }

    // Метод для проверки наличия элемента
    public boolean contains(Object o) {
        return false;
    }

    // Метод для преобразования в массив
    public Object[] toArray() {
        return null;
    }

    // Метод для нахождения индекса элемента
    public int indexOf(Object o) {
        return 0;
    }

    // Увеличение массива при необходимости
    private void ensureCapacity() {
    }

    // Проверка корректности индекса
    private void checkIndex(int index) {
    }
}

