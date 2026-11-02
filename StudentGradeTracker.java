/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentgradetracker;

import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        int choice;

        do {
            System.out.println("\n===== STUDENT GRADE TRACKER =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Find Highest Marks");
            System.out.println("5. Find Lowest Marks");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks! Enter marks between 0 and 100.");
                        break;
                    }

                    Student student = new Student(id, name, marks);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.println("Average Marks: "
                            + manager.calculateAverage());
                    break;

                case 4:
                    System.out.println("Highest Marks: "
                            + manager.findHighest());
                    break;

                case 5:
                    System.out.println("Lowest Marks: "
                            + manager.findLowest());
                    break;

                case 6:
                    System.out.println("Thank you for using Student Grade Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

