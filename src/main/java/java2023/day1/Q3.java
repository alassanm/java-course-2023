package java2023.day1;

public class Q3 {
    /* This is the main method */
    public static void main(String[] args) {
        /* Initial value of the counter */
        int x = 2;  // Changed from 'int x = 2.0;' to 'int x = 2;'
        double sum = 0.0;  // Added a semicolon at the end

        for (; x < 10; x++) {
            sum += x;
        }

        System.out.println("Sum is: " + sum);
    }
}
