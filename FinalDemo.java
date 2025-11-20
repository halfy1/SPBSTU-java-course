// Практика #1: Невозможность переопределения final-метода
class Parent {
    public final void show() {
        System.out.println("Final метод в суперклассе");
    }
}

class Child extends Parent {
    // Ошибка компиляции: нельзя переопределять final метод
    /*
    @Override
    public void show() {
        System.out.println("Переопределение final метода");
    }
    */
}

// Практика #2: Невозможность наследования от final-класса
final class FinalClass {
    public void display() {
        System.out.println("Метод final класса");
    }
}

/*
class Subclass extends FinalClass {  // Ошибка компиляции: невозможно наследоваться от final класса
}
*/

public class FinalDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}
