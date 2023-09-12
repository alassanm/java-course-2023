package java2023.day2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[100]; // Assuming a maximum of 100 scores
        int numScores = 0;
        double total = 0;

        System.out.println("Enter scores (enter a negative number to stop): ");

        // Read scores
        while (true) {
            double score = scanner.nextDouble();
            if (score < 0) {
                break;
            }
            scores[numScores] = score;
            total += score;
            numScores++;
        }

        // Calculate average
        double average = total / numScores;

        // Count scores above or equal to the average and below the average
        int aboveOrEqual = 0, below = 0;
        for (int i = 0; i < numScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Display results
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + below);

        // Close scanner
        scanner.close();
    }
}

