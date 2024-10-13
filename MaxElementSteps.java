import java.util.Scanner;

public class MaxElementSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Input array elements
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum element
        int maxElement = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Calculate the number of steps required to reach the maximum element from the first element
        int steps;
        if (maxElement == arr[0]) {
            steps = 1; // If max and first element are the same, it takes 1 step
        } else {
            steps = maxElement - arr[0];
        }
        System.out.println("Number of steps required to reach the maximum element: " + (steps+1));
    }
}
