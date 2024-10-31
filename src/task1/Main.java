package task1;

public class Main {
    public static void main(String[] args) {

        Person bob = new Person("Bob",25,"male", 180,80);
        Person masha = new Person("Masha",23,"female", 160,50);
        Person galia = new Person("Galiy",16,"female", 160,50);

        bob.printPersonInfo();
        masha.printPersonInfo();
        boolean age2 = bob.isOlderThan(masha);
        System.out.println(age2);

        masha.increaseAge();
        masha.increaseAge();
        masha.increaseAge();
        boolean age3 = bob.isOlderThan(masha);
        System.out.println(age3);

        boolean age4 = bob.isAdult();
        boolean age5 = masha.isAdult();
        boolean age6 = galia.isAdult();
        System.out.println(age4);
        System.out.println(age5);
        System.out.println(age6);
    }
}
