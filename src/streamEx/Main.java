package streamEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
List<Animal> animals = getAnimals();

//        //старый подход
//List<Animal> predators = new ArrayList<>();
//
//for (Animal animal : animals) {
//    if (animal.getClassification().equals(Classification.PREDATOR)) {
//        predators.add(animal);
//    }
//}
//predators.forEach(System.out::println);

        //новый подход (декларативный)

        //filter
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());

        //predators.forEach(System.out::println);

        //sort
       List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());
       sorted.forEach(System.out::println);

        //all match
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
        System.out.println();
        //none match
        //max
        //min
        //group
    }

    private static List<Animal> getAnimals() {
return List.of(
        new Animal("Слон", 20, Classification.HERBIVORE),
        new Animal("Лев", 15, Classification.PREDATOR),
        new Animal("Гиена", 18, Classification.PREDATOR),
        new Animal("Жираф", 7, Classification.HERBIVORE),
        new Animal("Динозавр", 200, Classification.PREDATOR),
        new Animal("Гиббон", 20, Classification.OMNIVOROUS)
);
    }

}
