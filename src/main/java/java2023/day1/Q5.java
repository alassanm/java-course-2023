package java2023.day1;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Create a scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        // Read integer from the console
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        // Close scanner to prevent resource leak
        scanner.close();

        // Initialize the result to 1
        int result = 1;

        // Calculate the product of all digits
        while (inputNumber != 0) {
            int digit = inputNumber % 10;
            result *= digit;
            inputNumber /= 10;
        }

        // Output the result
        System.out.println("Product of all digits: " + result);
    }
}
