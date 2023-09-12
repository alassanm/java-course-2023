package java2023.day1;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Create a scanner object to read the weight from the console
        Scanner scanner = new Scanner(System.in);

        // Read package weight from the console
        System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();

        // Close scanner to prevent resource leak
        scanner.close();

        // Initialize variable for shipping cost
        double shippingCost;

        // Calculate shipping cost based on weight
        if (weight > 0 && weight <= 3) {
            shippingCost = 1.5;
        } else if (weight > 3 && weight <= 5) {
            shippingCost = 2.5;
        } else if (weight > 5 && weight <= 10) {
            shippingCost = 4.2;
        } else {
            System.out.println("Invalid weight entered. Please enter a weight between 0 and 10.");
            return;
        }

        // Output the shipping cost
        System.out.println("The shipping cost is: " + shippingCost);
    }
}
