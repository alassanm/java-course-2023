package java2023.day2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number;

        while (true) {
            System.out.print("Enter an integer (enter 0 to quit): ");
            number = scanner.nextLong();

            if (number == 0) {
                break;
            }

            int sum = sumDigits(number);
            System.out.println("The sum of the digits is: " + sum);
        }

        System.out.println("Exiting program.");
        scanner.close();
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}

