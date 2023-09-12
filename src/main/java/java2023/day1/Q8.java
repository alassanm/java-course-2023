package java2023.day1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Create a scanner object to read the input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the position (N) of the desired Fibonacci number from the console
        System.out.print("Enter the position (N) of the Fibonacci number you want to find: ");
        int n = scanner.nextInt();

        // Close scanner to prevent resource leak
        scanner.close();

        // Validate the input
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        // Calculate the Nth Fibonacci number
        long first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            long temp = first;
            first = second;
            second = temp + second;
        }

        // Output the result
        System.out.println("The " + n + "th Fibonacci number is: " + first);
    }
}

