package BridgeLabz_Training;

// Imported utility package for List and ArrayList
import java.util.*;

// Student class
class Student {

    // Instance variables
    public int roll_no;
    String name;
    int marks;
    String grade;

    // Constructor
    Student(int roll_no, String name, int marks) {

        // 'this' keyword refers to current object
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;

        // Calling method to calculate grade
        this.grade = calculateGrade();
    }

    // Method to calculate grade
    public String calculateGrade() {

        // if marks are 90 or above
        if (marks >= 90) {

            return "A";
        }

        // if marks are 75 or above
        else if (marks >= 75) {

            return "B";
        }

        // if marks are 50 or above
        else if (marks >= 50) {

            return "C";
        }

        // otherwise student failed
        else {

            return "F";
        }
    }
}

// Main class
public class UniversityResultProcessing {

    public static void main(String[] args) {

        /*
         * ArrayList stores multiple Student objects
         */
        List<Student> students = new ArrayList<>();

        // Adding students into list
        students.add(new Student(1, "Bhoomika", 95));
        students.add(new Student(2, "Anshu", 98));
        students.add(new Student(3, "Palak", 94));
        students.add(new Student(4, "Sangeeta", 87));
        students.add(new Student(5, "Karan", 45));
        students.add(new Student(6, "Neha", 76));

        /*
         * Sorting students according to marks
         * in descending order
         * 
         * Lambda Expression:
         * (a,b) -> b.marks - a.marks
         * 
         * Means:
         * Compare marks of two students
         */
        students.sort((a, b) -> b.marks - a.marks);

        // Printing rankings
        System.out.println("Student Rankings:");

        int rank = 1;

        // for-each loop
        for (Student s : students) {

            System.out.println(
                    rank + ". " + s.name +
                            " -> " + s.marks + " marks");

            rank++;
        }

        // Printing toppers
        System.out.println("\nToppers List:");

        for (Student s : students) {

            // Students with marks >= 75
            if (s.marks >= 75) {

                System.out.println(
                        s.name + " Grade: " + s.grade);
            }
        }

        // Printing failed students
        System.out.println("\nFailed Students:");

        for (Student s : students) {

            /*
             * equals() is used for String comparison
             * 
             * Wrong:
             * s.grade == "F"
             * 
             * Correct:
             * s.grade.equals("F")
             */

            if (s.grade.equals("F")) {

                System.out.println(s.name);
            }
        }
    }
}