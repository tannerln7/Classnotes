import java.util.Scanner;

public class MainIfStatementDemo {
    public static void main(String[] args) {
        int score;
        String grade;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score: ");
        score = in.nextInt();
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade is: " + grade);
    }
}