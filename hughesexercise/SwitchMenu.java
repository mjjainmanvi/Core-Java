package com.edu.hughesexercise;

/**
 * if i give input as 1,
 * then data shld be inserted
 * input is 2
 * then data shld be deleted
 * input is 3
 * then data shld be displayed
 * input is 4
 * then duplicate values shld be displayed
 * note:switch
 */



import java.util.Scanner;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;

/**
 * @author user
 *
 */
public class SwitchMenu {
    public static void main(String[] args) {
        Vector<Integer> data = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to insert, 2 to delete, 3 to display, 4 to display duplicates, or 0 to exit:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting program...");
                    System.out.println("Successfully Exit");
                    return;
                case 1:
                    System.out.println("Enter a number to insert:");
                    int num = scanner.nextInt();
                    data.add(num);
                    break;
                case 2:
                    if (data.isEmpty()) {
                        System.out.println("No data to delete.");
                    } else {
                        System.out.println("Enter the index of the number to delete:");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < data.size()) {
                            data.remove(index);
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Data:");
                    for (Integer value : data) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Duplicate values:");
                    Set<Integer> set = new HashSet<>();
                    Set<Integer> duplicates = new HashSet<>();
                    for (Integer value : data) {
                        if (!set.add(value)) {
                            duplicates.add(value);
                        }
                    }
                    for (Integer duplicate : duplicates) {
                        System.out.print(duplicate + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

