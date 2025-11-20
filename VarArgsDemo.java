public class VarArgsDemo {

    public void printItems(int... numbers) {
        System.out.println("printItems(int...)");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printItems(String... strings) {
        System.out.println("printItems(String...)");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgsDemo demo = new VarArgsDemo();

        demo.printItems(1, 2, 3);
        demo.printItems("a", "b", "c");
    }
}
