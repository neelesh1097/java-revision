package Oops;

class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}

// A class is a blueprint or template used to create objects.
// It defines:
// What data an object will have (variables)
// What actions it can perform (methods)

public class class_obj {

    public static void main(String[] args) {
        Car c1 = new Car(); // object creation
        c1.color = "Red";
        c1.speed = 120;

        c1.drive();
        System.out.println(c1.color);
        System.out.println(c1.speed);
    }

}
// 🧍 Object (in Java)
// An object is a real instance of a class.
// It:
// Uses the class blueprint
// Holds actual values
// Can call class methods
