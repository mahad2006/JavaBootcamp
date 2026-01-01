package session2_oop;

public class CarGame {
    static void main() {
        Car ferrari = new Car();
        Car toyota = new Car();

        ferrari.brand = "Ferrari";
        toyota.brand = "Toyota";
        ferrari.year = 1990;
        toyota.year = 1990;
        ferrari.speed = 1;
        toyota.speed = 1;

        for (int i = 0; i < 3; i++) {
            ferrari.accelerate(50.5);
            toyota.accelerate(10.0);
        }

    }
}
