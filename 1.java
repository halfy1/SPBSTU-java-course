class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public boolean isInteger() {
        return item instanceof Integer;
    }

    public boolean isNumber() {
        return item instanceof Number;
    }
}

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(5);
        Wrapper<String> strWrapper = new Wrapper<>("text");

        System.out.println(intWrapper.isInteger());  // true
        System.out.println(strWrapper.isInteger());  // false

        System.out.println(intWrapper.isNumber());   // true
        System.out.println(strWrapper.isNumber());   // false
    }
}
