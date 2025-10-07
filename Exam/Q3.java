// Input the 3 marks from user and calculate it and ad the if else statement in detailed

import java.util.Scanner;
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int marks3 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3;
        float averageMarks = totalMarks / 3.0f;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 60) {
            System.out.println("Result: Pass");
        } else if (averageMarks >= 40) {
            System.out.println("Result: Supplementary");
        } else {
            System.out.println("Result: Fail");
        }
    }
}