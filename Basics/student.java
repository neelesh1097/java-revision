package Basics;

class students {
    int rollno;
    String name;
    int marks;

}

public class student {
    public static void main(String[] args) {
        students s1 = new students();
        s1.rollno = 21;
        s1.name = "someone";
        s1.marks = 80;

        students s2 = new students();
        s2.rollno = 71;
        s2.name = "some";
        s2.marks = 87;

        // ✅ Create array of students
        students[] arr = new students[2];
        arr[0] = s1;
        arr[1] = s2;

        for (students s : arr) {
            System.out.println(
                    "Roll No: " + s.rollno +
                            ", Name: " + s.name +
                            ", Marks: " + s.marks);
        }

    }

}
