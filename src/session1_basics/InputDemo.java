package session1_basics;

import java.util.Scanner;

public class InputDemo {


    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Developer Survey ---");

        // 1. Reading Primitives (Token-based)
        System.out.print("Years of Experience (int): ");
        int years = sc.nextInt();

        System.out.print("Desired Salary (double): ");
        double salary = sc.nextDouble();

        // 🛑 THE FIX: Consume the leftover newline character
        // If you remove this line, the next input will be skipped.
        sc.nextLine();

        // 2. Reading Strings (Line-based)
        System.out.print("Preferred Framework (String): ");
        String framework = sc.nextLine();

        System.out.println("\n--- Results ---");
        System.out.println("Exp: " + years + " years");
        System.out.println("Target: $" + salary);
        System.out.println("Framework: " + framework);

        // 3. Resource Management
        // Always close I/O streams to prevent memory leaks.
        sc.close();
    }
}
