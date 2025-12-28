package Basics;

public class bitwise_op {

    public static void main(String[] args) {
        int x = 5; // 0101
        int y = 3; // 0011

        x &= y;
        System.out.println(x); // 1

        x |= y;
        System.out.println(x); // 3

        x ^= y;
        System.out.println(x); // 0

    }

}
