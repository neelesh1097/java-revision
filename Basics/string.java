package Basics;

//String is immutable (cannot be changed once created)
//Stored in String Constant Pool (for optimization)
//Comes from java.lang package (no import needed)
//Supports many built-in methods

public class string {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.length()); // 4
        System.out.println(s.toUpperCase()); // JAVA
        System.out.println(s.charAt(1)); // a
        System.out.println(s.equals("Java")); // true

        // Creating Strings
        String s1 = "Java";
        String s2 = "Programming";
        String s3 = new String("Java");

        // Printing Strings
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        // String concatenation
        String result = s1 + " " + s2;
        System.out.println("Concatenation: " + result);

        // String methods
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Uppercase s1: " + s1.toUpperCase());
        System.out.println("Character at index 1: " + s1.charAt(1));

        // Comparing Strings
        System.out.println("s1 equals s3: " + s1.equals(s3)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // false

        // Immutability example
        s1.concat(" Language");
        System.out.println("After concat s1: " + s1); // still "Java"

        s1 = s1.concat(" Language");
        System.out.println("After reassignment s1: " + s1);

    }

}
