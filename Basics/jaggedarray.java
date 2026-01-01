package Basics;

public class jaggedarray {

    public static void main(String[] args) {

        // Declare jagged array
        int[][] arr = new int[3][];

        // Initialize each row with different sizes
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];

        // Assign values
        arr[0][0] = 10;
        arr[0][1] = 20;

        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[1][2] = 50;
        arr[1][3] = 60;

        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        // Print jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
