package session2_oop;

public class Car {
    String brand;
    int year;
    double speed;

    void accelerate(double amount)
    {
        speed += amount;
        System.out.println("Current speed: " + speed + "km/h");
    }

}
