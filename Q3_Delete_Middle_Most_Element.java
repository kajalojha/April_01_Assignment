package April_01_Assignment;

import java.util.Scanner;

public class Q3_Delete_Middle_Most_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        while (t!= 0) {
            System.out.print("Enter the size of the stack (N+1): ");
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            System.out.println("Enter the elements of the stack:");
            for (int i = 0; i <= n; i++) {
                arr[i] = scanner.nextInt();
            }
            deleteMiddlemostElement(arr, n);
        }
        scanner.close();
    }

    public static void deleteMiddlemostElement(int[] arr, int n) {
        int mid = (n + 1) / 2;
        // Shift elements to the left starting from the middle element
        for (int i = mid; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        // Print the updated stack
        System.out.print("Updated stack: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
