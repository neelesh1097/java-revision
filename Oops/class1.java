package Oops;

class calculator {

    public int add(int num1, int num2) {

        return num1 + num2;
    }

}

public class class1 {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;

        calculator calc = new calculator();

        int r = calc.add(num1, num2);

        System.out.println(r);

    }

}
