package java2023.day1;
import java.util.Scanner;

public class Q9b {
    public static void main(String[] args) {
        // Create a scanner object to read the input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the position (N) of the desired perfect number from the console
        System.out.print("Enter the position (N) of the perfect number you want to find: ");
        int n = scanner.nextInt();

        // Close scanner to prevent resource leak
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int count = 0;
        int number = 1;

        // Loop to find the Nth perfect number
        while (count < n) {
            int sumOfDivisors = 0;

            // Find the divisors of the number
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            // Check if the number is a perfect number
            if (number == sumOfDivisors) {
                count++;
            }

            // If we've found N perfect numbers, break out of the loop
            if (count == n) {
                break;
            }

            // Move on to the next number
            number++;
        }

        // Output the result
        System.out.println("The " + n + "th perfect number is: " + number);
    }
}
