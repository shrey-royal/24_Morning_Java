interface Father {
    double property = 20;
}

interface Mother {
    String manners = "Respect Elders";
}

public class Multiple implements Father, Mother {
    public static void main(String[] args) {
        System.out.println("Property: " + property + "\nManners: " + manners);
    }
}


// Use software development case scenario -> hybrid inheritance example