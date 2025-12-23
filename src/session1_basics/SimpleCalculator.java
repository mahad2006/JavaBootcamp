package session1_basics;

import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter operation: ");
        char  operation = sc.next().charAt(0);
        Integer result = null;
        if (operation == '+') {
            result = firstNumber + secondNumber;
        }
        else if (operation == '-') {
            result = firstNumber - secondNumber;
        }
        else if (operation == '*') {
            result = firstNumber * secondNumber;
        }
        else if (operation == '/') {
            result = firstNumber / secondNumber;
        }
        else if (operation == '%') {
            result = firstNumber % secondNumber;
        }
        else{
            System.out.println("Invalid operation");
        }
        sc.nextLine();
        System.out.println("Enter your name");
        String name =  sc.nextLine();
        System.out.println(result);
        System.out.println("Calculated by " + name);
    }
}
