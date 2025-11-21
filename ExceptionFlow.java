public class ExceptionFlow {
    public static void main(String[] args) {
        catchInCurrentMethod();
        uncaughtException();
    }

    private static void catchInCurrentMethod() {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Поймали ArithmeticException: " + e.getMessage());
        }
        System.out.println("Код после try-catch всё ещё выполняется");
    }

    private static void uncaughtException() {
        String s = null;
        // Здесь NullPointerException не оборачивается в try-catch
        // исключение пойдёт вверх по стеку и завершит программу
        System.out.println(s.length());
    }
}
