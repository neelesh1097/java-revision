package Oops;

class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}

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
