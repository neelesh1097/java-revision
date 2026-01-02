package Basics;

public class Stringbuffer {

    public static void main(String[] args) {

        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append (modify same object)
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 10, "Language");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Capacity
        StringBuffer sb2 = new StringBuffer();
        System.out.println("Default capacity: " + sb2.capacity());
    }

}
