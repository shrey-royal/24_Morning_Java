class FoodItem {
    //Attributes
    String name = "abcd";
    int calories;

    public FoodItem(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
    }
}

public class Basic {
    public static void main(String[] args) {
        // FoodItem generalItem;  //Object
        // generalItem = new FoodItem("Apple", 95);   //instance

        // FoodItem gen[] = new FoodItem[10];  //group of objects 
        // gen[0] = new FoodItem(null, 0); //instances

        FoodItem generalItem = new FoodItem("Apple", 95);
        generalItem.displayInfo();

        
    }
}