public class ScopeConcat {
    public static void main(String[] args) {
        System.out.println("Практика #3: Ошибка компиляции при использовании b вне блока.");

        // Практика #4: пример использования перегрузки оператора +
        String s = "Число: ";
        int i = 10;
        double d = 3.14;
        Object obj = new Object();

        System.out.println(s + i);
        System.out.println(s + d);
        System.out.println(s + obj);
        System.out.println(i + d + s);
    }
}
