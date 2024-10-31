package task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person bob = new Person("Bob",25,"male", 180,80);
        Person masha = new Person("Masha",23,"female", 160,50);
        Person galia = new Person("Galiy",16,"female", 160,50);
        Person dasha = new Person("Dasha",15, "famale", 158, 48);
        Person jony = new Person("Jony",48,"male", 185,90);
        Person vika = new Person("Vika",34,"female", 167,57);

        String [] array = new String[3];
        array [0] = "Bob";
        array [1] = "Masha";
        array [2] = "Galiy";

        List<String> peopleList = new ArrayList<>(); //это коллекция
        peopleList.add("Bob");
        peopleList.add("Masha");
        peopleList.add("Galiy");
        peopleList.add("Dasha");

      for (int i=0; i< array.length; i++ ) {
          String name = array[i];
          System.out.println(name);
      }
      //вывод коллекции
      for (int i=0; i< peopleList.size(); i++ ) {
          String name = peopleList.get(i);
          System.out.println(name);
      }
        System.out.println(Arrays.toString(array));
        int removeIndex = 1;
        for (int i = removeIndex; i <array.length-1;i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = null;
        System.out.println(Arrays.toString(array));
        System.out.println("*****************************************************************************************");

        System.out.println(peopleList);
        peopleList.remove(1);
        System.out.println(peopleList);
    }
}
