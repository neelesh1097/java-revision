package Oops;

class human {

    int age;
    String name;

    // public human() {
    // age = 12;
    // name = "neel";
    // }

    public human(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

public class constructor1 {

    public static void main(String[] args) {

        // human h = new human();

        human h = new human(21, "Neel");
        System.out.println(h.age + " " + h.name);
    }

}
