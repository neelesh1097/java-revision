package Basics;

import java.util.*;

public class multidimensional_array {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // ---------- 2D ARRAY INPUT ----------
        int n = scn.nextInt(); // rows
        int k = scn.nextInt(); // columns

        int[][] arr = new int[n][k];

        // Input values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Print 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // ---------- 3D ARRAY ----------
        int[][][] arr2 = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 },
                        { 10, 11, 12 }
                }
        };

        // Print 3D array
        System.out.println("\n3D Array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < arr2[i].length; j++) {
                for (int m = 0; m < arr2[i][j].length; m++) {
                    System.out.print(arr2[i][j][m] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scn.close();
    }
}
