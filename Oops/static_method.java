package Oops;

class Calculator {

    int x = 10; // instance variable
    static int y = 20; // static variable

    // 🔹 Static method
    static void addStatic() {
        System.out.println("Static Add: " + y);
        // System.out.println(x); // ❌ not allowed
    }

    // 🔹 Non-static method
    void addNonStatic() {
        System.out.println("Non-Static Add: " + (x + y));
    }
}

public class static_method {

    public static void main(String[] args) {

        // Calling static method (no object needed)
        Calculator.addStatic();

        // Calling non-static method (object needed)
        Calculator c = new Calculator();
        c.addNonStatic();
    }
}
