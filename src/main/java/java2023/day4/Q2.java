package java2023.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        // Create a set of vowels
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Read file name from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the text file name: ");
        String fileName = scanner.next();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert line to uppercase for case-insensitivity
                line = line.toUpperCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    // Check if the character is an alphabet letter
                    if (Character.isAlphabetic(ch)) {
                        if (vowels.contains(ch)) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Output the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}

