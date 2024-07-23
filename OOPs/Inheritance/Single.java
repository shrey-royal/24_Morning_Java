class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " is starting.");
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void drive() {
        System.out.println(model + " is driving.");
    }
}

public class Single {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Camry");
        c.start();
        c.drive();
    }
}
