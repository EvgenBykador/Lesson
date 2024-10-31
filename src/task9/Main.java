package task9;

import task3.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Masha", 23, "female", 160, 50));
        people.add(new Person("Dasha", 15, "female", 158, 48));
        people.add(new Person("Jony", 48, "male", 157, 90));
        people.add(new Person("Vika", 34, "female", 167, 57));
        people.add(new Person("Bob", 34, "male", 167, 57));

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("Masha", new Person("Masha", 23, "female", 160, 50));
        personMap.put("Dasha", new Person("Dasha", 15, "female", 158, 48));
        personMap.put("Jony", new Person("Jony", 48, "male", 157, 90));

//        System.out.println(personMap);
//        personMap.put("Dasha", new Person("Dasha", 32, "female", 165, 60));
//        System.out.println(personMap);

//        System.out.println(personMap.remove("Jony"));
//        System.out.println(personMap);
//        System.out.println(personMap.containsKey("Jony"));
//        System.out.println(personMap.containsKey("Oly"));
//        System.out.println(personMap.get("Masha"));
//        System.out.println(personMap.isEmpty());
//        System.out.println(personMap.size());

        Set<Map.Entry<String, Person>> entries = personMap.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println("Ключ: " + key + ", Эначение: " + value.getHeight());
        }
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Эначение: " + entry.getValue().getHeight());
        }

        personMap.forEach((key, person) -> {
            System.out.println("Ключ: " + key + ", Эначение: " + person.getHeight());
        });
    }
}
