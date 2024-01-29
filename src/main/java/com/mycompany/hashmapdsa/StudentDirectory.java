package com.mycompany.hashmapdsa;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDirectory {
    
    private HashMap<String, Student> students;
    private Scanner scanner;
    
    public StudentDirectory() {
        this.students = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void addStudent() {
        System.out.println("======================= ADD STUDENT =======================");
        System.out.print("Enter Student's Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student's ID Number: ");
        String idNumber = scanner.nextLine();
        
        // Check if the ID number already exists
        if (students.containsKey(idNumber)) {
            System.out.println("Student with the same ID Number already exists. Please enter a different ID Number.");
            return;
        }
        
        System.out.print("Enter Student's Major: ");
        String major = scanner.nextLine();
        
        Student student = new Student(name, idNumber, major);
        
        students.put(idNumber, student);
        
        System.out.println("\nSTUDENT ADDED SUCCESSFULLY!");
        System.out.println("===========================================================\n");
    }
    
    public void searchStudent() {
        System.out.println("===================== SEARCH STUDENT ======================");
        
        if (students.isEmpty()) {
            System.out.println("STUDENT DIRECTORY IS EMPTY!");
        }
        else {
            System.out.print("Enter Student's ID Number to search: ");
            String idNumber = scanner.nextLine();
            
            if (students.containsKey(idNumber)) {
                Student student = students.get(idNumber);
            
                System.out.println("\nSTUDENT FOUND:");
                System.out.println(student.toString());
            }
            else {
                System.out.println("\nSTUDENT NOT FOUND!");
            }
        }
        
        System.out.println("===========================================================\n");
    }
    
    public void deleteStudent() {
        System.out.println("===================== DELETE STUDENT ======================");
 
        if (students.isEmpty()) {
            System.out.println("STUDENT DIRECTORY IS EMPTY!");
        }
        else {
            System.out.print("Enter Student's ID Number to delete: ");
            String idNumber = scanner.nextLine();
            
            if (students.containsKey(idNumber)) {
                students.remove(idNumber);
            
                System.out.println("\nSTUDENT DELETED SUCCESSFULLY!");
            }
            else {
            System.out.println("\nSTUDENT NOT FOUND!");
            }
        }
        
        System.out.println("===========================================================\n");
    }
    
    public void displayStudentDirectory() {
        if (students.isEmpty()) {
            System.out.println("STUDENT DIRECTORY IS EMPTY!");
        }
        else {
            System.out.println("==================== STUDENT DIRECTORY ====================");

            for (Student student : students.values()) {
                System.out.println(student.toString());
                System.out.println("===========================================================");
            }
        }
        
        System.out.println("");
    }
}
