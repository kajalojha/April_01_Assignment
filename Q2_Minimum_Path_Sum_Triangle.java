package April_01_Assignment;

import java.util.Scanner;

public class Q2_Minimum_Path_Sum_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of test cases: ");
//        int t = scanner.nextInt();
//        while (t!= 0) {
            System.out.print("Enter the number of rows in the triangle: ");
            int n = scanner.nextInt();
            int[][] triangle = new int[n][n];
            System.out.println("Enter the elements of the triangle:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = scanner.nextInt();
                }
            }
            int result = minimumPathSum(triangle);
            System.out.println("Minimum path sum: " + result);
        //}
        scanner.close();
    }

    public static int minimumPathSum(int[][] triangle) {
        int n = triangle.length;
        // Start from second last row and move upwards
        for (int i = n - 2; i >= 0; i--) {
            // For each element in the current row, update it with the minimum sum of the adjacent elements
            for (int j = 0; j <= i; j++) {
                triangle[i][j] += Math.min(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        // The minimum path sum will be the value at the top of the triangle
        return triangle[0][0];
    }
}
