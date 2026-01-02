package Oops;

//Static variables are class-level variables whose accessibility depends on access modifiers 
//and whose mutability depends on whether they are declared final.

class Student {

    int rollNo; // instance variable
    static String college = "ABC College"; // static variable

    // ✅ Constructor
    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", College: " + college);
    }
}

public class static_var {

    public static void main(String[] args) {

        Student s1 = new Student(101);
        Student s2 = new Student(102);

        s1.display();
        s2.display();

        // Change static variable
        Student.college = "XYZ University";

        s1.display();
        s2.display();
    }
}
