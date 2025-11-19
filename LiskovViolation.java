public class Bird {
    public void fly() {
        System.out.println("Птица летит");
    }
}

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвин не умеет летать!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Bird penguin = new Penguin();
        penguin.fly(); // Ошибка во время выполнения!
    }
}
