import java.util.List;

class Producer<T> {
    public void processElements(List<? extends Number> list) {
        Number n = list.get(0);
        // list.add(10);          // ошибка компиляции! Запись запрещена
        System.out.println(n);
    }

    public void addElements(List<? super Integer> list) {
        list.add(10);
        // Integer i = list.get(0); // ошибка компиляции нельзя безопасно читать Integer
        Object o = list.get(0);
        System.out.println(o);
    }
}

public class MainGeneric {
    public static void main(String[] args) {
        Producer<Number> p = new Producer<>();

        List<Integer> intList = List.of(1, 2, 3);
        p.processElements(intList);

        List<Object> objList = new java.util.ArrayList<>();
        p.addElements(objList);
    }
}
