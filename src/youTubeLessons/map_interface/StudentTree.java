package youTubeLessons.map_interface;

import java.util.Objects;

final public class StudentTree implements Comparable<StudentTree>{
    final String name;
    final String surmame;
    final int course;

    public StudentTree(String name, String surmame, int course) {
        this.name = name;
        this.surmame = surmame;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surmame='" + surmame + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        youTubeLessons.map_interface.StudentTree student = (youTubeLessons.map_interface.StudentTree) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surmame, student.surmame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surmame, course);
    }

    @Override
    public int compareTo(StudentTree o) {
        return this.name.compareTo(o.name);
    }
}
