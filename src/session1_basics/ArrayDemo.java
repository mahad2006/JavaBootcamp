package session1_basics;

import java.util.Scanner;

public class ArrayDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array Elements are:");

        for (int num : numbers) {
            System.out.print(num + " | ");
        }
        System.out.println(); // New line

        sc.close();
    }
}
