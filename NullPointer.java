public class NullPointer {
    public static void main(String[] args) {
        Integer i = null;
        try {
            int a = i;  // unboxing вызовет NullPointerException
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException при unboxing-null");
        }
    }
}
