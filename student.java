import java.util.ArrayList;
import java.util.Scanner;

public class student {
    private String name;
    private ArrayList<Double> grades;

    // Constructor
    public student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Method to input grades
    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grades for " + name + " (enter -1 to finish):");
        double grade;
        do {
            System.out.print("Grade: ");
            grade = scanner.nextDouble();
            if (grade >= 0) {
                grades.add(grade);
            }
        } while (grade >= 0);
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return (grades.size() == 0) ? 0 : sum / grades.size();
    }

    // Method to display overall grade
    public void displayOverallGrade() {
        double averageGrade = calculateAverageGrade();
        System.out.println("Overall Grade for " + name + ": " + averageGrade);
        // You can add more information such as letter grade or GPA calculation here
    }

    public static void main(String[] args) {
        // Example usage
        student student = new student("John");
        student.inputGrades();
        student.displayOverallGrade();
    }
}

