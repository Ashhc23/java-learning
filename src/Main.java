
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String name;
        int age;
        double gpa;
        boolean isEnrolled;

        int[] marks = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println("Enter your GPA:");
        gpa = sc.nextDouble();

        System.out.println("Enter your marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Calculate total
        int total = calculateTotal(marks);

        // Calculate average
        double average = calculateAverage(total, marks.length);

        // Calculate grade
        char grade;

        if (average >= 90) {
            grade = 'A';
        }
        else if (average >= 80) {
            grade = 'B';
        }
        else if (average >= 70) {
            grade = 'C';
        }
        else {
            grade = 'F';
        }

        // Display results
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }

    // Calculate total of marks
    static int calculateTotal(int[] marks) {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    // Calculate average
    static double calculateAverage(int total, int count) {

        return (double) total / count;
    }
}

