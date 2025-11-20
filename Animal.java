class Animal {
    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Собака лает");
    }
    
    void makeSound(String voiceType) {
        System.out.println("Собака издает голос: " + voiceType);
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.makeSound(); 
        dog.makeSound();
        
        dog.makeSound("громкий лай");
    }
}
