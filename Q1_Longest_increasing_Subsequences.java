package April_01_Assignment;
import java.util.Scanner;
public class Q1_Longest_increasing_Subsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = longestIncreasingSubsequence(arr);
        System.out.println("Length of longest increasing subsequence: " + result);
        scanner.close();
    }

    // Function to find the length of the longest increasing subsequence
    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        // lis[i] stores the length of the longest increasing subsequence ending at index i
        int[] lis = new int[n];
        // Initializing lis[] with 1 as the minimum length of increasing subsequence for any element is 1
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            // Check for all previous elements if they can be part of the increasing subsequence
            for (int j = 0; j < i; j++) {
                // If arr[i] is greater than arr[j] and adding arr[i] to the sequence
                // gives a longer subsequence, update lis[i]
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        // Find the maximum length of the increasing subsequence
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }
}
