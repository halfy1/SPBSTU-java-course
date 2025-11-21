// Практика #1: Спецификаторы доступа для внутренних классов
public class Outer {
    public class PublicInner {
        public void msg() {
            System.out.println("Public inner class");
        }
    }

    protected class ProtectedInner {
        void show() {
            System.out.println("Protected inner class");
        }
    }

    class DefaultInner {
        void display() {
            System.out.println("Default (package-private) inner class");
        }
    }

    private class PrivateInner {
        void print() {
            System.out.println("Private inner class");
        }
    }
}

// Практика #2: Внутренний класс имеет доступ ко всем полям и методам внешнего класса, включая private
public class Outer2 {
    private int x = 10;

    public class Inner {
        public void innerMethod() {
            System.out.println("Доступ к private полю внешнего класса: " + x);
        }
    }
}

// Практика #3: Внешний класс имеет доступ ко всем членам внутреннего класса, включая private
public class Outer3 {
    private Inner inner = new Inner();

    private class Inner {
        private String secret = "секрет";

        private void reveal() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public void outerMethod() {
        System.out.println("Доступ к private полю внутреннего класса: " + inner.secret);
        inner.reveal();
    }
}
