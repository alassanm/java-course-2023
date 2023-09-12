package java2023.day1;
import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Create a scanner object to read the secret number from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a secret number between 0 and 1000: ");
        int secretNumber = scanner.nextInt();
        
        // Close scanner to prevent resource leak
        scanner.close();

        // Create a Random object for generating random numbers
        Random random = new Random();
        
        // Initialize counter for the number of guesses
        int numberOfGuesses = 0;
        
        // Initialize variable to store the guessed number
        int guessedNumber;

        // Loop until the program guesses the correct number
        do {
            // Generate a random number between 0 and 1000
            guessedNumber = random.nextInt(1000);

            // Increment the number of guesses
            numberOfGuesses++;

        } while (guessedNumber != secretNumber);

        // Output the result
        System.out.println("Secret number: " + secretNumber);
        System.out.println("Number of tries needed: " + numberOfGuesses);
    }
}
