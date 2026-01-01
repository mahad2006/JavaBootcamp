package session1_basics;

import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of total students:");
        int n = sc.nextInt();
        int[] marks = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks for " + (i+1) + ":");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double average = sum*1.0 / n;
        int max = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("Average marks is " + average);
        System.out.println("Maximum marks is " + max);
        sc.close();
    }
}
