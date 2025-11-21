import java.util.Formatter;
import java.util.Date;

public class FormatterUsage {
    public static void main(String[] args) {
        // Практика #1: пять спецификаторов общего формата
        Formatter fmt = new Formatter();

        boolean bool = true;
        char ch = 'J';
        int num = 123;
        double val = 3.14159;
        String str = "Java";

        fmt.format("boolean: %b%n", bool);
        fmt.format("char: %c%n", ch); 
        fmt.format("decimal: %d%n", num); 
        fmt.format("float: %f%n", val); 
        fmt.format("string: %s%n", str);

        System.out.print(fmt);
        fmt.close();

        // Практика #2: flush()
        // flush() нужен, чтобы принудительно «сбросить» буфер форматтера/потока на реальный вывод
        
        System.out.printf("Авто flush после строки: %d%n", 42);
        System.out.flush();

        // Практика #3: пять спецификаторов даты/времени
        Formatter timeFmt = new Formatter();
        Date now = new Date();

        timeFmt.format("Часы: %tH%n", now);
        timeFmt.format("Минуты: %tM%n", now); 
        timeFmt.format("Секунды: %tS%n", now); 
        timeFmt.format("Год: %tY%n", now); 
        timeFmt.format("Месяц: %tB%n", now);

        System.out.print(timeFmt);
        timeFmt.close();
    }
}
