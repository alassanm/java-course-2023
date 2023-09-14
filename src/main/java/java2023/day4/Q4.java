package java2023.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Read integers from file
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            while (fileScanner.hasNextInt()) {
                list.add(fileScanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        // Sort the list
        sort(list);

        // Output the sorted list
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list.get(j+1) and list.get(i)
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

