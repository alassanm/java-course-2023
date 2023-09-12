package java2023.day1;

public class Q2 {
    public static void main(String[] args) {
        // First block with do-while loop
        byte i = 0;
        do {
            byte a = (i++);
            byte b = --a;
            System.out.println("First block output: " + a + " " + b + " " + i);
        } while (i < 0);

        // Second block with while loop
        i = 0;  // Resetting 'i' to 0
        while (i < 0) {
            byte a = (i++);
            byte b = --a;
            System.out.println("Second block output: " + a + " " + b + " " + i);
        }
    }
}

// it runs at least once