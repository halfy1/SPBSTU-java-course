public class SwitchTypes {
    enum Day { MON, TUE, WED }

    public static void main(String[] args) {
        byte b = 1;
        switch (b) {
            case 1 -> System.out.println("byte: 1");
            case 2 -> System.out.println("byte: 2");
            default -> System.out.println("byte: default");
        }

        short s = 2;
        switch (s) {
            case 1 -> System.out.println("short: 1");
            case 2 -> System.out.println("short: 2");
            default -> System.out.println("short: default");
        }

        char c = 'A';
        switch (c) {
            case 'A' -> System.out.println("char: A");
            case 'B' -> System.out.println("char: B");
            default -> System.out.println("char: default");
        }

        int i = 3;
        switch (i) {
            case 3 -> System.out.println("int: 3");
            case 4 -> System.out.println("int: 4");
            default -> System.out.println("int: default");
        }

        Byte bb = 4;
        switch (bb) {
            case 3 -> System.out.println("Byte: 3");
            case 4 -> System.out.println("Byte: 4");
            default -> System.out.println("Byte: default");
        }

        Integer ii = 5;
        switch (ii) {
            case 5 -> System.out.println("Integer: 5");
            case 6 -> System.out.println("Integer: 6");
            default -> System.out.println("Integer: default");
        }

        Day day = Day.MON;
        switch (day) {
            case MON -> System.out.println("enum Day: MON");
            case TUE -> System.out.println("enum Day: TUE");
            default -> System.out.println("enum Day: default");
        }

        String str = "Hello";
        switch (str) {
            case "Hello" -> System.out.println("String: Hello");
            case "World" -> System.out.println("String: World");
            default -> System.out.println("String: default");
        }
    }
}
