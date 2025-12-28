package Basics;

class logical_op {

    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a < b && b > 15); // true
        System.out.println(a > b && b > 15); // false

        int x = 5, y = 10;

        System.out.println(x > y || y == 10); // true
        System.out.println(x > y || y < 5); // false

        boolean isJavaEasy = true;

        System.out.println(!isJavaEasy); // false

    }

}
