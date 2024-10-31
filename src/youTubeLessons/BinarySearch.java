package youTubeLessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        Employee emp1 = new Employee(100, "Evgen", 12345 );
        Employee emp2 = new Employee(15, "Ivan", 6542 );
        Employee emp3 = new Employee(123, "Petr", 8542 );
        Employee emp4 = new Employee(15, "Mariya", 5678 );
        Employee emp5 = new Employee(182, "Kolya", 125 );
        Employee emp6 = new Employee(15, "Sasha", 9874 );
        Employee emp7 = new Employee(25, "Elena", 1579 );
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList
        , new Employee(182, "Kolya", 125 ));
        System.out.println(index2);
    }
    static class Employee implements Comparable<Employee> {
        int id;
        String name;
        int salary;

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(Employee anotherEmp) {
            int result = this.id - anotherEmp.id;
            if (result == 0) {
                result = this.name.compareTo(anotherEmp.name);
            }
            return result;
        }

    }
}
