package Basics;

public class typeconversion {
    public static void main(String[] args) {
        // Widening Casting (Implicit) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Widening Casting:");
        System.out.println("int value: " + myInt);
        System.out.println("double value: " + myDouble);

        // Narrowing Casting (Explicit) - converting a larger type to a smaller size
        // type
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + myDouble2);
        System.out.println("int value: " + myInt2);

        // type promotion

        byte a = 10;
        byte b = 30;
        int result = a * b;

        System.out.println(result);
    }
}
