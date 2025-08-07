class Base {
    void BaseMeathod() {
        System.out.println("Base meathod called.");
    }
}

class Derived1 extends Base {
    void Derived1Meathod() {
        System.out.println("Derived1 meathod called.");
    }
}

class Derived2 extends Base {
    void Derived2Meathod() {
        System.out.println("Derived2 meathod called.");
    }
}

public class derivbase {
    public static void main(String[] args) {
        Base b = new Base();
        b.BaseMeathod();

        Derived1 d1 = new Derived1();
        d1.BaseMeathod();
        d1.Derived1Meathod();

        Derived2 d2 = new Derived2();
        d2.BaseMeathod();
        d2.Derived2Meathod();
    }
}