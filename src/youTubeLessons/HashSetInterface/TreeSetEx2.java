package youTubeLessons.HashSetInterface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Evgen", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet); //методы first(первый выведется),.last(последний)
        //.headSet-например выведутся все ниже 3-го курса  .tailSet (выведутся выше 3-го включительно)
        //sub.Set - принимает два параметра и выводит элементы содержащиеся между ними

        Student st6 = new Student("Oleg", 2);
        Student st7 = new Student("Ivan", 4);
        System.out.println(treeSet.subSet(st6,st7));

        System.out.println(st3.equals(st6));
        System.out.println(st3.hashCode() == st6.hashCode());

    }
}

    class Student implements Comparable<Student>{

    String name;
    int cours;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }

        @Override
        public int compareTo(Student other) {
            return this.cours - other.cours;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return cours == student.cours;
        }

        @Override
        public int hashCode() {
            return Objects.hash(cours);
        }
    }
