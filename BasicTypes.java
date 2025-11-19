public class BasicTypes {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        BasicTypes example = new BasicTypes();

        // Практика #1: нулевые значения базовых типов
        System.out.println("byte: " + example.b);
        System.out.println("short: " + example.s);
        System.out.println("int: " + example.i);
        System.out.println("long: " + example.l);
        System.out.println("float: " + example.f);
        System.out.println("double: " + example.d);
        System.out.println("char (code): " + (int) example.c);
        System.out.println("boolean: " + example.bool);

        // Практика #2: вывод имени с Unicode символами
        System.out.println("\u041F\u0440\u0438\u0432\u0435\u0442, \u041C\u0438\u0440\u043E\u0441\u043B\u0430\u0432!");
    }
}
