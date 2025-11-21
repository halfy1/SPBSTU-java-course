interface Action {
    // default-метод интерфейса (может быть переопределён в классе)
    default void run() {
        System.out.println("Action.run default");
    }

    // статический метод интерфейса (вызывается по имени интерфейса)
    static void info() {
        System.out.println("Action.info static");
    }
}

class Task implements Action {
    @Override
    public void run() {
        System.out.println("Task.run override");
    }
}

interface First {
    default void doWork() {
        System.out.println("First.doWork");
    }
}

interface Second {
    default void doWork() {
        System.out.println("Second.doWork");
    }
}

class Worker implements First, Second {
    // переопределяем, чтобы разрешить конфликт двух одинаковых default-методов
    @Override
    public void doWork() {
        First.super.doWork();
        // или Second.super.doWork();
    }
}

class Main {
    public static void main(String[] args) {
        Task t = new Task();
        t.run();

        Action a = t;
        a.run();

        Action.info();

        Worker w = new Worker();
        w.doWork();
    }
}
