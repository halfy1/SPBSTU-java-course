public class TypeConv {
    public static void main(String[] args) {
        // Практика #5: арифметические операции с разными типами
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.5;

        double res = b + s + i + l + f + d;
        System.out.println("Практика #5: результат = " + res);

        // Практика #6: сужающее преобразование
        int val = 130;
        byte narrow = (byte) val;
        System.out.println("Практика #6: сужающее преобразование = " + narrow);
    }
}
