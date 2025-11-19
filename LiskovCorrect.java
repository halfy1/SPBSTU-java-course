public class Bird {
    public void eat() {
        System.out.println("Птица ест");
    }
}

public interface Flyable {
    void fly();
}

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Воробей летит");
    }
}

public class Penguin extends Bird {
    // Пингвин не летает, не реализует Flyable
}

public class Main {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        sparrow.fly();

        Bird penguin = new Penguin();
        penguin.eat();
    }
}
