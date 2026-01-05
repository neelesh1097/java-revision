package Oops;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog eats");
    }
}

public class upcasting {
    public static void main(String[] args) {

        Animal a = new Dog(); // ✅ UPCASTING
        a.sound(); // Dog's sound (runtime polymorphism)

        // a.eat(); ❌ not accessible
    }
}
