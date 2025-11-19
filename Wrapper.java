public class Wrapper {
    public static void main(String[] args) {
        // Практика #1: decode()
        Integer dec1 = Integer.decode("0xA");
        Integer dec2 = Integer.decode("012");
        Integer dec3 = Integer.decode("10");
        System.out.println(dec1 + ", " + dec2 + ", " + dec3);

        // Практика #2: создание Boolean
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = new Boolean(true);
        Boolean b4 = new Boolean("true");
        System.out.println(b1 + ", " + b2 + ", " + b3 + ", " + b4);

        // Автоупаковка и автораспаковка
        Integer i = 12; 
        int j = i;     
        System.out.println("i = " + i + ", j = " + j);
    }
}
