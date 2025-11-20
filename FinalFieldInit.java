public class FinalFieldInit {

    public final int a;

    public FinalFieldInit(int value) {
        this.a = value;
    }

    // Вариант 2: инициализация при объявлении
    // public final int a = 10;

    public static void main(String[] args) {
        FinalFieldInit obj1 = new FinalFieldInit(5);
        System.out.println("obj1.a = " + obj1.a);

        // Вариант 2: если инициализация при объявлении раскомментирована
        FinalFieldInit obj2 = new FinalFieldInit(42);
        System.out.println("obj2.a = " + obj2.a);
    }
}
