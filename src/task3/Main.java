package task3;




import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person bob = new Person("Bob", 25, "male", 180, 80);
        people.add(bob);
        Person galiy = new Person("Galiy", 16, "female", 160, 50);
        people.add(galiy);

        people.add(new Person("Masha", 23, "female", 160, 50));
        people.add(new Person("Dasha", 15, "female", 158, 48));
        people.add(new Person("Jony", 48, "male", 157, 90));
        people.add(new Person("Vika", 34, "female", 167, 57));
        people.add(new Person("Bob", 34, "male", 167, 57));

//       System.out.println(people);
////        printInfo(people);
//        increaseAgeForAll(people);
//       System.out.println("-------------------------------------------------------");
//        System.out.println(people);
//        printInfo(people);//      printName(people);
//       List<Person> peopleByName = findPeopleByNameIgnoreCase(people, "Bob");
//        printInfo(peopleByName);
//        List<Person> people1 = findPeopleByWeightMoreThan(people, 60 );
//        printInfo(people1);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        List<Person> people2 = findAllAdult(people);
//        printInfo(people2);
//        System.out.println(findPeopleByHeightRange(people, 167, 186));
//        System.out.println(getAllNames(people));
//        people.forEach(p -> System.out.println(p.getName()));
//        System.out.println(isAdult(bob));
 //       System.out.println(isAdult(galiy));
//        System.out.println(getGender(bob));
//        System.out.println(getGender(galiy));
 //       System.out.println(getOldestPerson(people));
   //    System.out.println(getShortestFemale(people));
      // System.out.println(getPersonByName(people,"Galiy"));
 //       System.out.println(getUniqueName(people));
        System.out.println(findPeopleByGender(people, "male"));

    }
    //вернуть людей определенного гендера
        public static List<Person> findPeopleByGender(List<Person> people, String gender) {
            ArrayList<Person> result = new ArrayList<>();
            for (Person person : people) {
            String gender1 = person.getGender();
            if (gender1.equalsIgnoreCase(gender)) {
                result.add(person);
            }
        }
            return result;
        }

    //ДЗ вернуть человека по имени
    public static Person getPersonByName(List<Person> people, String name) {
        Person result = null;
        for (Person person : people) {
            String personName = person.getName();
                if (personName.equalsIgnoreCase(name)) {
                    result = person;
            }
        }
        return result;
    }
    //ДЗ получить людей с уникальными именами
//    public static List<Person> getPeopleWithUniqueName(List<Person> personList) {
//
//    }

    //вернуть уникальный список имен
    public static Set<String> getUniqueName(List<Person> people) {
        HashSet<String> result = new HashSet<>();
        //1-тип данных  2- имя объекта  3-коллекция по которой будем бегать
        for (Person person : people) {
            String personName = person.getName();  //у объкта Person берем имя
            result.add(personName);
        }
return result;
    }

    //вернуть самую низкую девочку
    public static Person getShortestFemale(List<Person> people) {
        Person result = null;
        double height = 200;
        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase("female") && height > person.getHeight()) {
                result = person;
                height = person.getHeight();
            }
        }
        return result;
    }

    //вернуть самого старшего человека
    public static Person getOldestPerson(List<Person> people) {
        Person result = null;
        int age = 0;
        for (Person person : people) {
            if(age < person.getAge()) {
                result = person;
                age = person.getAge();
            }
        }
        return result;
    }

    public static String isAdult(Person person) {
//        if (person.isAdult()) {
//            return "Совершеннолетний";
//        } else {
//            return "Не совершеннолетний";
//        }
        return person.isAdult() ? "Совершеннолетний" : "Не совершеннолетний";
    }

    public static String getGender(Person person) {
        return person.getGender().equalsIgnoreCase("male") ? "M" : "F";
    }
    //вернуть имена людей
    public static List<String> getAllNames(List<Person> people) {
        List<String> result = new ArrayList<>();
        for (Person person : people) {
            result.add(person.getName());
        }
        return result;
    }
    //найти людей с ростом в определенном диапозоне
    public static List<Person> findPeopleByHeightRange(List<Person> people, double minHeight, double maxHeight ) {
    List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getHeight() > minHeight && person.getHeight() < maxHeight) {
                result.add(person);
            }
        }
        return result;
    }
    //найти всех совершеннолетних
    public static List<Person> findAllAdult(List<Person> people) {
        List<Person> result = new ArrayList<>();
        for (int i = 0;i< people.size();i++){
            Person person = people.get(i);
            if (person.isAdult()) {
                result.add(person);
            }
        }
        return result;
    }
    //найти людей с весом выше заданного значения
    public static List<Person> findPeopleByWeightMoreThan(List<Person> people, double weight) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            double personWeight = person.getWeight();
            if (personWeight > weight ) {
                result.add(person);
            }
        }
        return result;
    }
    //найти людей по имени игнорируя регистр
    public static List<Person> findPeopleByNameIgnoreCase(List<Person> people, String name) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i< people.size(); i++) {
            Person person = people.get(i);
            String  personName = person.getName();
            if (personName.equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }
    public static void printInfo(List<Person> peopleList) {
        for (int i = 0; i < peopleList.size(); i++) {
            Person person = peopleList.get(i);
            person.printPersonInfo();
        }
    }
    //задача- увеличить возраст всех людей в списке
    public static void increaseAgeForAll(List<Person> personList) {
//        for(int i = 0; i < personList.size();i++) {
//           Person person = personList.get(i);
//           person.increaseAge();
//        }
        //personList.forEach(person -> person.increaseAge());
        personList.forEach(Person::increaseAge);
    }
    //распечать только имена людей
    public static void printName(List<Person> peopleList) {
        for(int i = 0; i< peopleList.size(); i++) {
            Person person = peopleList.get(i);
           String name = person.getName();
            System.out.println(name);
        }
    }
}




