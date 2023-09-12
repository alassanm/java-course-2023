package java2023.day1;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Declare constants
        final double PI = 3.14159265359;

        // Create a scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        // Read radius from the console
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Close scanner to prevent resource leak
        scanner.close();

        // Calculate the area and circumference
        double area = PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;

        // Output the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    }
}

