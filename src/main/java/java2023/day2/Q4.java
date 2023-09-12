package java2023.day2;

public class Q4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

