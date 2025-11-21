public class ExceptionsUsage {

    public static void main(String[] args) {
        handleArithmeticException();
        handleArrayIndexOutOfBoundsException();
        handleIllegalArgumentException();
        handleClassCastException();
        handleNullPointerException();
    }

    // ArithmeticException: деление на ноль
    private static void handleArithmeticException() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    // ArrayIndexOutOfBoundsException: выход за границы массива
    private static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            int x = arr[3];
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // IllegalArgumentException: некорректный аргумент метода
    private static void handleIllegalArgumentException() {
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    private static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст: " + age);
    }

    // ClassCastException: неправильное приведение типов
    private static void handleClassCastException() {
        try {
            Object obj = "Java";
            Integer num = (Integer) obj; 
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }

    // NullPointerException: обращение к методу/полю через null
    private static void handleNullPointerException() {
        try {
            String s = null;
            int len = s.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
