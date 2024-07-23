class IceCream {
    String colors[] = {"White", "Brown", "Pink", "Yellow", "Orange"};
    String flavors[] = {"Vanilla", "Chocolate", "Strawberry", "ButterScotch", "Mango"};

    static int iceCreamsLeft = 5;
    boolean flag = false;

    IceCream(String flavor) {
        if(iceCreamsLeft > 0) {
            for (int i = 0; i < flavor.length(); i++) {
                if(this.flavors[i].equals(flavor)) {
                    System.out.println("You have selected " + this.flavors[i] + " flavor and you get " + this.colors[i] + " color ice cream. Enjoy!");
                    iceCreamsLeft--;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println("Sorry! We don't have this flavor.");
            }
        } else {
            System.out.println("Sorry! We are out of icecreams.");
        }
    }
}

@SuppressWarnings("unused")
public class StaticKW {
    public static void main(String[] args) {
        System.out.println("Ice Creams left: " + IceCream.iceCreamsLeft);

        IceCream ic1 = new IceCream("Vanilla");
        System.out.println("Ice Creams left: " + IceCream.iceCreamsLeft);

        IceCream ic2 = new IceCream("ButterScotch");
        System.out.println("Ice Creams left: " + IceCream.iceCreamsLeft);

        IceCream ic3 = new IceCream("ButterScotch");
        System.out.println("Ice Creams left: " + IceCream.iceCreamsLeft);

        IceCream ic4 = new IceCream("Chocolate");
        System.out.println("Ice Creams left: " + IceCream.iceCreamsLeft);

        IceCream ic5 = new IceCream("Chocolate");
        System.out.println("Ice Creams left: " + IceCream.iceCreamsLeft);

        IceCream ic6 = new IceCream("Mango");
    }
}


/*
Static is used to refer the common property of all objects.

Anything that will be declared as static will be common for all the objects of that class.

Task:

Problem Statement: Car Fleet Management

You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.

*/