package practik;

public class runner {
    public static void main (String[] args) {
        Fish fish = new Fish();
        Duke duke  = new Duke();
        Plane plane = new Plane();

        Swimable[] swimpool = {fish,duke};
        Flyable[] sky = {duke,plane};
        for (Swimable swimable:swimpool) {
            swimable.swim();
        }
        for (Flyable flyable : sky) {
            flyable.fly();
        }

    }
}
