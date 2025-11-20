public class LoopsAndControl {
    public static void main(String[] args) {
        // Практика #1: бесконечные циклы while и do-while
        // Бесконечный while с break
        int count = 0;
        while (true) {
            System.out.println("while loop: " + count);
            count++;
            if (count >= 5) {
                break;
            }
        }

        // Бесконечный do-while с break
        count = 0;
        do {
            System.out.println("do-while loop: " + count);
            count++;
            if (count >= 5) {
                break;
            }
        } while (true);

        // Практика #2: использование break и continue
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println("for loop with break/continue: " + i);
        }

        // Цикл for для массива
        int[] arr = {1, 3, 5, 7, 9};
        for (int elem : arr) {
            System.out.printf("%d ", elem);
        }
        System.out.println();
    }
}
