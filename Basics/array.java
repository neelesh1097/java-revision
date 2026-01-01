package Basics;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = scn.nextInt();

        int k[] = new int[n]; // Array creation

        System.out.println("Enter " + n + " elements:");
        // Normal for loop for input
        for (int i = 0; i < n; i++) {
            k[i] = scn.nextInt();
        }

        System.out.println("Array elements are:");
        // Advanced for loop (Enhanced for loop) to print array
        for (int element : k) {
            System.out.println(element);
        }
    }
}
