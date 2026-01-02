package Oops;

class Person {

    private int age; // private data
    private String name; // private data

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // validation
            this.age = age;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Person p = new Person();

        p.setAge(21);
        p.setName("Neelesh");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }

}
