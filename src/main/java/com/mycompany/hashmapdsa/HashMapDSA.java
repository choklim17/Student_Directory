package com.mycompany.hashmapdsa;

import java.util.Scanner;

public class HashMapDSA {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StudentDirectory directory = new StudentDirectory();
        
        boolean shouldExit = false;
        
        do {
            System.out.println("Enter 1 to add Student");
            System.out.println("Enter 2 to search Student");
            System.out.println("Enter 3 to delete Student");
            System.out.println("Enter 4 to display Student Directory");
            System.out.println("Enter 5 to Exit");
            
            System.out.print("Enter Choice: ");
            String choice = scanner.nextLine();
            
            System.out.println("");
            
            switch (choice) {
                case "1":
                    directory.addStudent();
                    break;
                case "2":
                    directory.searchStudent();
                    break;
                case "3":
                    directory.deleteStudent();
                    break;
                case "4":
                    directory.displayStudentDirectory();
                    break;
                case "5":
                    System.out.println("Exiting Program...");
                    shouldExit = true;
                    break;
                default:
                    System.out.println("Invalid Choice.");
                    break;               
            }
            
        } while (!shouldExit);
    }
}
