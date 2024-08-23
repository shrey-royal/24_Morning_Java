package restaurant;

public class Menu {
    String[] starters = {"Samosa", "Paneer Tikka", "Dhokla"};
    String[] mainCourse = {"Chole Bhature", "Paneer Butter Masala", "Aloo Paratha"};
    String[] desserts = {"Gulab Jamun", "Rasgulla", "Kheer"};
    String[] beverages = {"Masala Chai", "Mango Lassi", "Nimbu Pani"};

    public void displayMenu() {
        System.out.println("----- Starters -----");
        for (String item : starters) {
            System.out.println(item);
        }

        System.out.println("\n----- Main Course -----");
        for (String item : mainCourse) {
            System.out.println(item);
        }

        System.out.println("\n----- Desserts -----");
        for (String item : desserts) {
            System.out.println(item);
        }

        System.out.println("\n----- Beverages -----");
        for (String item : beverages) {
            System.out.println(item);
        }
    }

    public String[] getCategoryItems(String category) {
        switch (category.toLowerCase()) {
            case "starters":
                return starters;
            case "main course":
                return mainCourse;
            case "desserts":
                return desserts;
            case "beverages":
                return beverages;
            default:
                return new String[0];
        }
    }

    public int getPrice(String item) {
        switch (item.toLowerCase()) {
            case "samosa":
            case "dhokla":
                return 50;
            case "paneer tikka":
            case "aloo paratha":
            case "nimbu pani":
                return 100;
            case "chole bhature":
            case "paneer butter masala":
            case "masala chai":
                return 150;
            case "gulab jamun":
            case "rasgulla":
            case "mango lassi":
                return 80;
            case "kheer":
                return 120;
            default:
                return 0;
        }
    }
}
