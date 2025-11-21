class Parent {
    void process() {
        System.out.println("Parent.process");
    }
}

class Child extends Parent {
    @Override
    void process() {                 // переопределяем метод родителя
        System.out.println("Child.process");
    }

    @Deprecated
    void oldMethod() {               // устаревший метод
        System.out.println("old");
    }

    @SuppressWarnings("deprecation")
    void useOld() {                  // сознательно вызываем устаревший метод
        oldMethod();
    }
}

// Пользовательская аннотация
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface BaseAction {
    int level();
}

@BaseAction(level = 2)
class Base {
    public void doAction() {
        Class<?> clazz = Base.class;
        BaseAction action = clazz.getAnnotation(BaseAction.class);
        System.out.println(action.level());
    }
}

class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.process();
        c.useOld();

        Base b = new Base();
        b.doAction();
    }
}
