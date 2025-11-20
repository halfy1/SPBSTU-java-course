// Практика #1: использование super
class Parent {
    int a = 10;

    Parent() {
        System.out.println("Конструктор Parent");
    }

    void show() {
        System.out.println("Метод Parent, a = " + a);
    }
}

class Child extends Parent {
    int a = 20;

    Child() {
        super(); // вызов конструктора суперкласса
        System.out.println("Конструктор Child");
    }

    void show() {
        System.out.println("a в Child = " + a);
        System.out.println("a из Parent через super = " + super.a); // доступ к полю суперкласса
        super.show(); // вызов метода суперкласса
    }
}

// Практика #3: использование this() для вызова другого конструктора
class AClass {
    int a, b, c, z;

    public AClass() {
        this.z = 1;
    }

    public AClass(int a) {
        this();
        this.a = a;
    }

    public AClass(int a, int b) {
        this(a);
        this.b = b;
    }

    public AClass(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }
}
