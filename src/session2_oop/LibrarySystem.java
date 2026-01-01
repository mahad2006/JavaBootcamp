package session2_oop;

public class LibrarySystem {
    public static void main(String[] args) { // <--- The Standard Signature!

        // 1. Create an Object (Instantiate)
        Book book1 = new Book();

        // 2. Set Attributes (Direct Access)
        book1.title = "The Alchemist";
        book1.author = "Paulo Coelho";
        book1.price = 15.00;
        book1.isAvailable = true;

        // 3. Create another Object
        Book book2 = new Book();
        book2.title = "Java for Beginners";
        book2.author = "Mahad";
        book2.price = 50.00;
        book2.isAvailable = false;

        // 4. Call Methods
        book1.displayInfo();

        System.out.println(); // Space

        book2.displayInfo();
        book2.applyDiscount(10); // Give 10% discount
    }
}
