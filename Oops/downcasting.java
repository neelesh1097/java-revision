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

public class downcasting {
    public static void main(String[] args) {

        Animal a = new Dog(); // upcasting
        Dog d = (Dog) a; // ✅ DOWNCASTING

        d.sound();
        d.eat();
    }
}
