import java.util.Arrays;

public class ArraysUsage {
    public static void main(String[] args) {
        // Практика #2: использование методов класса Arrays
        String[] names = {"Иван", "Петр", "Анна", "Мария"};
        System.out.println("toString: " + Arrays.toString(names));

        int[] nums = {4, 2, 7, 1, 5};

        Arrays.sort(nums);
        System.out.println("Отсортированный массив: " + Arrays.toString(nums));

        int index = Arrays.binarySearch(nums, 4);
        System.out.println("Индекс элемента 4: " + index);

        int[] numsCopy = {1, 2, 4, 5, 7};
        boolean isEqual = Arrays.equals(nums, numsCopy);
        System.out.println("Массивы равны: " + isEqual);
    }
}
