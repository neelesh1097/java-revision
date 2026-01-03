package Oops;

class calc {

    public int add(int n, int j) {
        return n + j;
    }

}

class advcalc extends calc {

    public int mult(int n, int j) {
        return n * j;
    }
}

public class inheritance {

    public static void main(String[] args) {

        advcalc calc = new advcalc();

        int r1 = calc.add(5, 6);
        int r2 = calc.mult(4, 5);

        System.out.println(r1 + " " + r2);
    }

}
