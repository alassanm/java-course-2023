package java2023.day2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the first three letters of a month name (first letter in uppercase): ");
        String month = scanner.next();

        int days = 0;

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||
            month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            days = 31;
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            days = 30;
        } else if (month.equals("Feb")) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            System.out.println("Invalid month input.");
            scanner.close();
            return;
        }

        System.out.println("The month " + month + " in the year " + year + " has " + days + " days.");

        scanner.close();
    }
}

