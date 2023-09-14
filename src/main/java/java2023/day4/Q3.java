package java2023.day4;

import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        HashMap<String, String> boys = new HashMap<>();
        HashMap<String, String> girls = new HashMap<>();
        
        // Reading file
        try (Scanner fileScanner = new Scanner(new File("baby_names.txt"))) {
            while (fileScanner.hasNext()) {
                String rank = fileScanner.next();
                String boyName = fileScanner.next();
                String boyNumber = fileScanner.next();
                String girlName = fileScanner.next();
                String girlNumber = fileScanner.next();
                
                boys.put(boyName, "Rank: " + rank + ", Number: " + boyNumber);
                girls.put(girlName, "Rank: " + rank + ", Number: " + girlNumber);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        
        Scanner inputScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the gender (boy/girl) or type 'exit' to quit: ");
            String gender = inputScanner.next().toLowerCase();
            
            if (gender.equals("exit")) {
                break;
            }
            
            System.out.println("Enter the name: ");
            String name = inputScanner.next();
            
            if (gender.equals("boy")) {
                System.out.println(boys.getOrDefault(name, "Name not found"));
            } else if (gender.equals("girl")) {
                System.out.println(girls.getOrDefault(name, "Name not found"));
            } else {
                System.out.println("Invalid gender. Please enter 'boy' or 'girl'.");
            }
            
            System.out.println("Would you like to search another name? (yes/no)");
            String another = inputScanner.next().toLowerCase();
            if (!another.equals("yes")) {
                break;
            }
        }
        
        inputScanner.close();
    }
}

