// Практика #1: Пример перегруженных методов
public class OverloadingExample {
    public void show(int a) {
        System.out.println("int: " + a);
    }

    public void show(int a, int b) {
        System.out.println("int, int: " + a + ", " + b);
    }

    public void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.show(5);
        obj.show(10, 20);
        obj.show("Привет");
    }
}

// Практика #2: Пример переопределенного метода и несоответствие типов возвращаемого значения
class Parent {
    public int calculate() {
        return 5;
    }
}

class Child extends Parent {
    /*
    // Ошибка компиляции, тип возвращаемого значения должен совпадать
    @Override
    public double calculate() {
        return 5.0;
    }
    */

    @Override
    public int calculate() {
        return 10;
    }
}

// Практика #3: Пример использования @Override для обнаружения ошибки
class Base {
    public void display() {
        System.out.println("Base display");
    }
}

class Derived extends Base {
    @Override
    public void dispaly() { // Ошибка: опечатка в имени метода, компилятор выдаст ошибку
        System.out.println("Derived display");
    }
}
