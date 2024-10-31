package practik;

public class Duke implements Flyable, Swimable{
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}
