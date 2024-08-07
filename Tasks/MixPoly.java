/*
Problem Statement:

You are developing a system for managing a restaurant. The restaurant offers various cuisines and serves different types of customers. Your task is to create a system that manages both the cuisines and customer interactions.

1. Cuisine Representation: Define a class to represent a cuisine. Each cuisine should have attributes for its name and a description. Include a method to provide details about the cuisine.

2. Specific Cuisines: Implement at least three distinct cuisine types, each represented by its own class. Each class should include a specific description for the cuisine.

3. Customer Representation: Define a class to represent a customer. Each customer should have attributes for their name and their favorite cuisine. Include a method to display the customer’s details.

4. Restaurant Management: Develop a class to manage a collection of cuisines and customers. This class should support CRUD operations (Create, Read, Update, Delete) for both cuisines and customers using arrays. For example:
   - Add a new cuisine or customer.
   - View details of a cuisine or customer.
   - Update the details of a cuisine or customer.
   - Remove a cuisine or customer.

5. Implementation: In your main program, create instances of different cuisines and customers, add them to the restaurant management system, and then demonstrate CRUD operations on both cuisines and customers. 

Hints:
- Use arrays or similar data structures to store collections of cuisines and customers.
- Ensure that your CRUD methods handle adding, viewing, updating, and removing elements from these collections.
*/

class Cuisine {
    private String name, description;

    public Cuisine(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void displayDetails() {
        System.out.println("Cuisine Name: " + name);
        System.out.println("Description: " + description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ItalianCuisine extends Cuisine {
    
    public ItalianCuisine() {
        super("Italian", "Rich in flavours, featuring pasta, pizza, and more.");
    }
}

class ChineseCuisine extends Cuisine {
    
    public ChineseCuisine() {
        super("Chinese", "Known for its use of rice, noodles, and various spices.");
    }
}

class MexicanCuisine extends Cuisine {
    
    public MexicanCuisine() {
        super("Mexican", "Famous for its spicy dishes and use of beans and tortillas.");
    }
}

class Customer {
    private String name;
    private Cuisine favouriteCuisine;   //Aggregation

    public Customer(String name, Cuisine favouriteCuisine) {
        this.name = name;
        this.favouriteCuisine = favouriteCuisine;
    }

    public String getName() {
        return name;
    }

    public Cuisine getFavouriteCuisine() {
        return favouriteCuisine;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.print("Favourite Cuisine: ");
        favouriteCuisine.displayDetails();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteCuisine(Cuisine favouriteCuisine) {
        this.favouriteCuisine = favouriteCuisine;
    }
}

class RestaurantManager {
    private Cuisine[] cuisines = new Cuisine[10];
    private Customer[] customers = new Customer[10];
    private int cuisineCount = 0;
    private int customerCount = 0;

    /**
     * @param cuisine
     */
    public void addCuisine(Cuisine cuisine) {
        if(cuisineCount >= cuisines.length) {
            System.out.println("Can't add more cuisines as the array is full!");
            return;
        }
        cuisines[cuisineCount++] = cuisine;
    }

    /**
     * @param index
     */
    public void viewCuisine(int index) {
        if(index >= 0 && index < cuisineCount) {
            cuisines[index].displayDetails();
        } else {
            System.out.println("Cuisine not found!");
        }
    }

    /**
     * @param index
     * @param newName
     * @param newDescription
     */
    public void updateCuisine(int index, String newName, String newDescription) {
        if(index >= 0 && index < cuisineCount) {
            cuisines[index].setName(newName);
            cuisines[index].setDescription(newDescription);
        } else {
            System.out.println("Cuisine not found!");
        }
    }

    /**
     * @param index
     */
    public void removeCuisine(int index) {
        if(index >= 0 && index < cuisineCount) {
            for (int i = index; i < cuisineCount-1; i++) {
                cuisines[i] = cuisines[i+1];
            }
            cuisines[--cuisineCount] = null;
        } else {
            System.out.println("Cuisine not found!");
        }
    }

    /**
     * @param customer
     */
    public void addCustomer(Customer customer) {
        if(customerCount < customers.length) {
            customers[customerCount++] = customer;
        } else {
            System.out.println("Customer array is full.");
        }
    }

    /**
     * @param index
     */
    public void viewCustomer(int index) {
        if(index >= 0 && index < customerCount) {
            customers[index].displayDetails();
        } else {
            System.out.println("Customer not found!");
        }
    }

    // single line comment
    
    /* 
     * multi
     * line
     * comment
    */

    /**
     * javadoc comment
     */

    /**
     * @param index
     * @param newName
     * @param newFavouriteCuisine
     */
    public void updateCustomer(int index, String newName, Cuisine newFavouriteCuisine) {
        if(index >= 0 && index < cuisineCount) {
            customers[index].setName(newName); 
            customers[index].setFavouriteCuisine(newFavouriteCuisine);
        } else {
            System.out.println("Customer not found!");
        }
    }

    /**
     * @param index
     */
    public void removeCustomer(int index) {
        if(index >= 0 && index < customerCount) {
            for (int i = index; i < customerCount-1; i++) {
                customers[i] = customers[i+1];
            }
            customers[--customerCount] = null;
        } else {
            System.out.println("Customer not found!");
        }
    }
}

public class MixPoly {
    public static void main(String[] args) {
        RestaurantManager management = new RestaurantManager();
        
        Cuisine italian = new ItalianCuisine();
        Cuisine chinese = new ChineseCuisine();
        Cuisine mexican = new MexicanCuisine();

        management.addCuisine(italian);
        management.addCuisine(chinese);
        management.addCuisine(mexican);

        Customer arin = new Customer("Arin", italian);
        Customer marmik = new Customer("Marmik", chinese);

        // arin.displayDetails();
        // marmik.displayDetails();

        // management.viewCuisine(0);
        // management.viewCuisine(1);
        // management.viewCuisine(2);

        // management.updateCuisine(0, "italy", null);
        // management.viewCuisine(0);

        // management.removeCuisine(0);

        // management.viewCuisine(0);
        // management.viewCuisine(1);

    }
}
