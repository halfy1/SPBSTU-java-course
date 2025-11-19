public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean bool1 = true, bool2 = false;
        String s1 = "Hello", s2 = "World";

        // =, +=, -=, *=, /=, %=
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;

        System.out.println("a = " + a);

        // Тернарный оператор ?:
        String res = (a > b) ? "a > b" : "a <= b";
        System.out.println(res);

        // Логические операторы
        System.out.println(bool1 && bool2);
        System.out.println(bool1 || bool2);
        System.out.println(!bool1);
        System.out.println(bool1 & bool2);
        System.out.println(bool1 | bool2);
        System.out.println(bool1 ^ bool2);

        // Сравнения
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Побитовые сдвиги
        int c = 8;
        System.out.println(c >> 1);
        System.out.println(c >>> 1);
        System.out.println(c << 1);

        // Арифметические
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Инкременты и декременты
        int x = 5;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);

        // Конкатенация + и += для String
        String hello = "Hello";
        String world = "World";
        String result = hello + ", " + world + "!";
        System.out.println(result);
        hello += " again!";
        System.out.println(hello);
    }
}
