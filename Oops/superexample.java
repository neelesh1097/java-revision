package Oops;

class Parent {
    Parent(int a) {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(10); // calls parent constructor
        System.out.println("Child constructor");
    }
}

public class superexample {
    public static void main(String[] args) {
        new Child();
    }
}
