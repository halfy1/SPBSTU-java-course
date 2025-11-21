import java.util.StringJoiner;

public class Strings {
    public static void main(String[] args) {
        // Практика #1: 10 методов String
        String s = "  Hello, Java 17!  ";

        System.out.println("length: " + s.length());                 // длина строки
        System.out.println("charAt(2): " + s.charAt(2));             // символ по индексу
        System.out.println("substring(2, 7): " + s.substring(2, 7)); // подстрока
        System.out.println("toUpperCase: " + s.toUpperCase());       // в верхний регистр
        System.out.println("toLowerCase: " + s.toLowerCase());       // в нижний регистр
        System.out.println("trim: '" + s.trim() + "'");              // убрать пробелы по краям
        System.out.println("contains(\"Java\"): " + s.contains("Java")); // проверка вхождения
        System.out.println("indexOf('J'): " + s.indexOf('J'));       // первый индекс символа
        System.out.println("replace(\"Java\", \"World\"): " + s.replace("Java", "World")); // замена
        System.out.println("startsWith(\"  He\"): " + s.startsWith("  He")); // проверка начала строки

        // Практика #2: StringJoiner
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("one");
        joiner1.add("two");
        joiner1.add("three");
        System.out.println("joiner1: " + joiner1);

        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("a");
        joiner2.add("b");
        joiner2.add("c");
        System.out.println("joiner2: " + joiner2);

        String[] words = {"red", "green", "blue"};
        StringJoiner joiner3 = new StringJoiner(" | ");
        for (String w : words) {
            joiner3.add(w);
        }
        System.out.println("joiner3: " + joiner3);

        // Практика #3: три двойные кавычки — text block
        String json = """
                {
                  "name": "Java",
                  "version": 17
                }
                """;
        System.out.println(json);
    }
}
