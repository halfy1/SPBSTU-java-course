// Вложенный класс внутри интерфейса
interface MyInterface {
    void doSomething();

    class NestedClass {
        public void greet() {
            System.out.println("Вложенный класс интерфейса!");
        }
    }
}

public class ClassInInterface {
    public static void main(String[] args) {
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.greet();
    }
}
