public class AccessModifiers {
    
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public void publicMethod() {
        System.out.println("public метод - доступен всем");
    }

    protected void protectedMethod() {
        System.out.println("protected метод - доступен в пакете и подклассам");
    }

    void defaultMethod() {
        System.out.println("default метод - доступен только в пакете");
    }

    private void privateMethod() {
        System.out.println("private метод - доступен только в этом классе");
    }

    public void demonstrateAccess() {
        System.out.println("Доступ внутри класса AccessModifiers:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("privateVar = " + privateVar);
        
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.demonstrateAccess();
    }
}

class SamePackageClass {
    public void testAccess() {
        AccessModifiers obj = new AccessModifiers();
        
        System.out.println("\nДоступ из другого класса в том же пакете:");
        System.out.println("publicVar = " + obj.publicVar);
        System.out.println("protectedVar = " + obj.protectedVar);
        System.out.println("defaultVar = " + obj.defaultVar);
        // System.out.println("privateVar = " + obj.privateVar); // Ошибка компиляции
        
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // Ошибка компиляции
    }
}

class SubclassInSamePackage extends AccessModifiers {
    public void testAccess() {
        System.out.println("\nДоступ из подкласса в том же пакете:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        // System.out.println("privateVar = " + privateVar); // Ошибка компиляции
        
        publicMethod();
        protectedMethod();
        defaultMethod();
        // privateMethod(); // Ошибка компиляции
    }
}
