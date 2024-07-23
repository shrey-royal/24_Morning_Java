class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    private int teamSize;

    Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
    }

    public void manage() {
        System.out.println("Managing a team of " + teamSize + " people.");
    }
}

class Director extends Manager {
    private double budget;

    public Director(String name, int teamSize, double budget) {
        super(name, teamSize);
        this.budget = budget;
    }

    public void makeDecision() {
        System.out.println("Making decisions with a budget of Rs." + budget);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Director director = new Director("Vishva", 10, 50000000);
        director.work();
        director.manage();
        director.makeDecision();
    }
}
