public class StringsMutable {
    public static void main(String[] args) {
        // Практика #1: 10 методов StringBuilder / StringBuffer

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("append: " + sb.append(" Java"));              // добавление в конец
        System.out.println("insert: " + sb.insert(5, ","));               // вставка по индексу
        System.out.println("replace: " + sb.replace(0, 5, "Hi"));         // замена подстроки
        System.out.println("delete: " + sb.delete(2, 3));                 // удаление подстроки
        System.out.println("reverse: " + sb.reverse());                   // разворот строки
        System.out.println("length: " + sb.length());                     // текущая длина
        System.out.println("capacity: " + sb.capacity());                 // текущая ёмкость буфера
        System.out.println("charAt: " + sb.charAt(0));                    // символ по индексу
        System.out.println("substring: " + sb.substring(1, 3));           // подстрока как String
        sb.setLength(2);                                                  // обрезка / изменение длины
        System.out.println("setLength: " + sb);

        StringBuffer buffer = new StringBuffer("Sync");
        buffer.append(" Buffer");                                         // те же операции, но потокобезопасно
        System.out.println("StringBuffer: " + buffer);

        // Практика #2: преобразования между String, StringBuilder, StringBuffer

        String str = "Text";

        // String -> StringBuilder / StringBuffer
        StringBuilder sbFromString = new StringBuilder(str);
        StringBuffer bufFromString = new StringBuffer(str);

        // StringBuilder -> String / StringBuffer
        String fromSb = sbFromString.toString();
        StringBuffer bufFromSb = new StringBuffer(sbFromString.toString());

        // StringBuffer -> String / StringBuilder
        String fromBuf = bufFromString.toString();
        StringBuilder sbFromBuf = new StringBuilder(bufFromString.toString());

        System.out.println("sbFromString: " + sbFromString);
        System.out.println("bufFromString: " + bufFromString);
        System.out.println("fromSb: " + fromSb);
        System.out.println("bufFromSb: " + bufFromSb);
        System.out.println("fromBuf: " + fromBuf);
        System.out.println("sbFromBuf: " + sbFromBuf);
    }
}
