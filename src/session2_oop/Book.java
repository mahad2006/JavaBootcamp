package session2_oop;

public class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;
    // 2. METHODS (Behavior)
    // Notice: No 'static'. These belong to a specific object.
    void displayInfo() {
        System.out.println("--- Book Details ---");
        System.out.println("Title:  " + title);
        System.out.println("Author: " + author);
        System.out.println("Price:  $" + price);

        if(isAvailable) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Out of Stock");
        }
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
        System.out.println("Discount applied! New price: " + price);
    }
}
