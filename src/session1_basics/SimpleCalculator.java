package session1_basics;

import java.util.Scanner;

public class SimpleCalculator {

    // 1. STANDARD MAIN SIGNATURE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 2. USE DOUBLE FOR PRECISION
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);

            double result = 0;
            boolean validOperation = true; // Flag to track status

            // 3. SWITCH STATEMENT (Cleaner than if-else)
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break; // Break prevents it from running the next case
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Handle Division by Zero
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation selected");
                    validOperation = false;
            }

            // Buffer Cleanup
            sc.nextLine();

            // Only ask for name if the math worked
            if (validOperation) {
                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.println("Result: " + result);
                System.out.println("Calculated by: " + name);
            }

            System.out.println("Type 0 to quit and 1 to continue");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
        }

        sc.close();
    }
}