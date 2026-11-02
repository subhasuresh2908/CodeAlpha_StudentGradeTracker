/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package studentgradetracker;

import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student with duplicate ID validation
    public void addStudent(Student student) {

        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n========== STUDENT REPORT ==========");

        System.out.printf("%-10s %-15s %-10s %-10s%n",
                "ID", "NAME", "MARKS", "GRADE");

        System.out.println("-----------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-10d %-15s %-10.2f %-10s%n",
                    s.getId(),
                    s.getName(),
                    s.getMarks(),
                    s.calculateGrade());
        }

        System.out.println("-----------------------------------------------");
    }

    // Calculate average
    public double calculateAverage() {

        if (students.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        return total / students.size();
    }

    // Find highest marks
    public double findHighest() {

        if (students.isEmpty()) {
            return 0;
        }

        double highest = students.get(0).getMarks();

        for (Student s : students) {
            if (s.getMarks() > highest) {
                highest = s.getMarks();
            }
        }

        return highest;
    }

    // Find lowest marks
    public double findLowest() {

        if (students.isEmpty()) {
            return 0;
        }

        double lowest = students.get(0).getMarks();

        for (Student s : students) {
            if (s.getMarks() < lowest) {
                lowest = s.getMarks();
            }
        }

        return lowest;
    }
}
