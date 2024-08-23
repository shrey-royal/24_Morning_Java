package restaurant;

public class Order {
    String[] orderedItems;
    int itemCount;
    int totalAmount;

    public Order(int maxItems) {
        orderedItems = new String[maxItems];
        itemCount = 0;
        totalAmount = 0;
    }

    public void addItem(String item) {
        orderedItems[itemCount++] = item;
    }

    public void calculateTotal(Menu menu) {
        for (int i = 0; i < itemCount; i++) {
            totalAmount += menu.getPrice(orderedItems[i]);
        }
    }

    public void displayOrder(Menu menu) {
        System.out.println("\n----- Order Summary -----");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(orderedItems[i] + " - " + menu.getPrice(orderedItems[i]));
        }
        System.out.println("Total Amount: Rs. " + totalAmount);
    }
}
