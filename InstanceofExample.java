public class InstanceofExample {

    static class Animal {}
    static class Dog extends Animal {}
    static class Cat extends Animal {}

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal ad = new Dog();

        System.out.println(a instanceof Animal);
        System.out.println(d instanceof Dog);
        System.out.println(c instanceof Cat);
        System.out.println(ad instanceof Dog);
        System.out.println(d instanceof Animal);

        Animal n = null;
        System.out.println(n instanceof Animal);

        if (d instanceof Animal) {
            System.out.println("d — животное");
        }
        if (!(n instanceof Animal)) {
            System.out.println("n это null");
        }
    }
}
