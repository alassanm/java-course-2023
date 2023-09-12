package java2023.day2;

import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a single character: ");
    String input = scanner.next();
    scanner.close();
    
    if (input.length() != 1) {
      System.out.println("Invalid input! Please enter just one character.");
      return;
    }
    
    char character = input.charAt(0);
    
    int unicodeValue = (int) character; // Convert to Unicode
    
    String hexValue = Integer.toHexString(unicodeValue); // Convert to Hexadecimal
    
    System.out.println("The Unicode value in hexadecimal is: " + hexValue);
    
    scanner.close();
  }
}

