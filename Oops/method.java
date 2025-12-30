package Oops;

class Computer {

    public String display(int cost) {
        if (cost > 1000) {
            return "available";
        }
        return "not available";
    }

    public String cpu(int cost2) {
        if (cost2 > 1000) {
            return "available";
        }
        return "not available";
    }
}

public class method {

    public static void main(String[] args) {

        Computer c = new Computer();
        System.out.println(c.display(1500));
    }

}
