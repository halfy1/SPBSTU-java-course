// Практика #1: Инициализация элементов enum с полями
public enum Day {
    MONDAY("Начало недели"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Выходной"),
    SUNDAY("Выходной");

    private final String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// Практика #2: enum с дополнительным методом
enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public Direction opposite() {
        return switch (this) {
            case NORTH -> SOUTH;
            case SOUTH -> NORTH;
            case EAST -> WEST;
            case WEST -> EAST;
        };
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today + ": " + today.getDescription());

        Direction dir = Direction.NORTH;
        System.out.println("Opposite of " + dir + " is " + dir.opposite());
    }
}
