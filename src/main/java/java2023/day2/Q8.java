package java2023.day2;

import java.util.Scanner;
import java.util.HashSet;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] list = new int[n];

        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        scanner.close();

        int[] uniqueList = removeDuplicates(list);

        System.out.print("The array without duplicates: ");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] list) {
        HashSet<Integer> set = new HashSet<>();

        // Count the number of unique elements
        for (int num : list) {
            set.add(num);
        }

        int[] uniqueList = new int[set.size()];
        int i = 0;

        // Populate the uniqueList array
        for (int num : set) {
            uniqueList[i] = num;
            i++;
        }

        return uniqueList;
    }
}

