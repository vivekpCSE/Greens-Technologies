abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Normal method
    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car Starts with Key");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
    }
}