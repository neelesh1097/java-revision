package Oops;

class overloading {

    public int calculator(int n, int k) {

        return n + k;
    }

    public int calculator2(int n, int k, int m) {

        return n + k + m;

    }

    public double calc3(int n, double k, double m) {

        return n + k + m;

    }
}

public class method_overloading {

    public static void main(String[] args) {

        overloading obj = new overloading();

        double res = obj.calc3(4, 4.56, 6.6);

        System.out.println(res);

    }

}
