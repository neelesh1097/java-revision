package Oops;

class Mobile {

    int price;
    String brand;
    static String name;

    // ✅ Static block
    static {
        name = "Phone";
        System.out.println("in static");
    }

    // ✅ Constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    // ✅ Method
    public void show() {
        System.out.println(name + " " + price + " " + brand);
    }
}

public class constructor {

    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.brand = "Apple";

        m.show();
    }
}
