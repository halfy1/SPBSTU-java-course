class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class MultiCatchExamples {

    public static void main(String[] args) {
        handleSeveralDifferentExceptions();
        handleHierarchy();
    }

    private static void handleSeveralDifferentExceptions() {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new IllegalArgumentException("bad argument");
            } else {
                throw new IllegalStateException("bad state");
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Проблема с параметрами/состоянием: " + e.getMessage());
        }
    }

    private static void handleHierarchy() {
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Поймали Ex3");
        } catch (Ex2 e) {
            System.out.println("Поймали Ex2");
        } catch (Ex1 e) {
            System.out.println("Поймали Ex1");
        }

    }
}
