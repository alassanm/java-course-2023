package java2023.day2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid.");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if the length is at least 8
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        // Check if the password contains a "." character
        if (password.contains(".")) {
            return false;
        }

        return true;
    }
}

