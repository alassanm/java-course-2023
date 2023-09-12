package java2023.day1;
public class Q9a {
    public static void main(String[] args) {
        // Loop to iterate through numbers less than 100,000
        for (int i = 1; i < 100000; i++) {
            int sumOfDivisors = 0;

            // Loop to find divisors of i
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sumOfDivisors += j;
                }
            }

            // Check if i is a perfect number
            if (i == sumOfDivisors) {
                System.out.println(i + " is a perfect number.");
            }
        }
    }
}
