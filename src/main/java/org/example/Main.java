package org.example;

import org.example.utils.stringDuplicator.Deduplicator;
import org.example.utils.stringDuplicator.FunctionalStringDeduplicator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deduplicator deduplicator = new FunctionalStringDeduplicator();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean keepRunning = true;

            while (keepRunning) {
                System.out.println("\n=== Deduplicator Menu ===");
                System.out.println("1) Enter a string to remove duplicates");
                System.out.println("2) Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1" -> {
                        System.out.print("Enter a string: ");
                        String input = scanner.nextLine();
                        String output = deduplicator.removeDuplicates(input);
                        System.out.println("Output without duplicates: " + output);
                    }
                    case "2" -> {
                        System.out.println("Exiting the application...");
                        keepRunning = false;
                    }
                    default -> System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }
}