/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package studentgradetracker;

public class Student {

    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
    
     
public double calculateTotalMarks() {
    return marks;
}



    // Calculate student grade
    public String calculateGrade() {

        if (marks >= 90) {
            return "A";
        } 
        else if (marks >= 80) {
            return "B";
        } 
        else if (marks >= 70) {
            return "C";
        } 
        else if (marks >= 60) {
            return "D";
        } 
        else {
            return "F";
        }
    }
}
