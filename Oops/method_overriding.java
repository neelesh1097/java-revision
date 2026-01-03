package Oops;

class calc {

    public int add(int n, int j) {
        return n + j;
    }
}

class AdvCalc extends calc {

    @Override
    public int add(int n, int j) {
        return n + j + 10; // extra logic
    }
}

public class method_overriding {

    public static void main(String[] args) {

        calc obj = new AdvCalc(); // runtime polymorphism
        int r1 = obj.add(5, 6);

        System.out.println(r1);
    }
}
