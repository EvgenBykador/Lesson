package task2;

public class Person {

    private  String name;
    private int age;
    private String gender;
    private double height;
    private double weight;

    public Person(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void printPersonInfo() {
        System.out.println(name +" "+ age+" "+ gender+" "+ height + " "+ weight);
    }
    public void increaseAge() {
        this.age++;
    }

    public boolean isOlderThan(Person other) {
        return this.age > other.getAge();
    }

    public boolean isAdult() {
        return this.age >=18;
    }

}
