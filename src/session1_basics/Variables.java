package session1_basics;

public class Variables {
    public static void main(String[] args) {

        // --- 1. PRIMITIVES & SIZES ---

        // byte: 8-bit (-128 to 127) - Good for saving memory in large arrays
        byte smallNum = 100;

        // short: 16-bit (-32,768 to 32,767)
        short mediumNum = 30000;

        // int: 32-bit (Standard choice)
        int standardNum = 1000000;

        // long: 64-bit (Use 'L' at the end, or it treats it as int)
        long hugeNum = 9000000000L;

        // float: 32-bit (Use 'f' or 'F' at the end, or it treats it as double)
        float price = 19.99f;

        // double: 64-bit (Standard for decimals, more precision)
        double precisePrice = 19.994234234;

        // char: 16-bit Unicode (C++ char is 8-bit ASCII, Java char is bigger!)
        char letter = 'A';
        char unicodeSymbol = '\u0041'; // Unicode for 'A'

        // boolean: size depends on JVM (usually 1 bit logically, but stored as byte/int)
        boolean isJavaStrict = true;

        // --- 2. WRAPPER CLASSES & AUTOBOXING ---
        // These are Classes, not keywords. They have methods.

        Integer wrappedInt = 500; // Autoboxing (int -> Integer)
        Double wrappedDouble = 99.99;
        Character wrappedChar = 'Z';
        Boolean wrappedBool = Boolean.FALSE;

        // Why use Wrappers? They have utility methods and allow Null.
        String maxIntString = Integer.toString(standardNum); // Convert number to string
        int parsedInt = Integer.parseInt("123"); // Convert string to number

        System.out.println("--- Data Type Analysis ---");
        System.out.println("Long Value: " + hugeNum);
        System.out.println("Float Value: " + price);

        // Printing Memory Sizes (In Bits)
        System.out.println("Size of int in bits: " + Integer.SIZE);
        System.out.println("Size of long in bits: " + Long.SIZE);
        System.out.println("Size of float in bits: " + Float.SIZE);

        // Wrappers can be null (Primitives cannot)
        Integer databaseValue = null;
        System.out.println("Null value safely held in Wrapper: " + databaseValue);
    }
}