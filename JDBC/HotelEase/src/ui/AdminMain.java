package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controller.HotelController;
import model.Hotel;

public class AdminMain {
	private static HotelController hotelController = new HotelController();
    private static Scanner scanner = new Scanner(System.in);

    public static void hotelMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- HotelEase Menu ---");
            System.out.println("1. Add Hotel");
            System.out.println("2. View Hotel by ID");
            System.out.println("3. View All Hotels");
            System.out.println("4. Update Hotel");
            System.out.println("5. Delete Hotel");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addHotel();
                    break;
                case 2:
                    viewHotelById();
                    break;
                case 3:
                    viewAllHotels();
                    break;
                case 4:
                    updateHotel();
                    break;
                case 5:
                    deleteHotel();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }

    private static void addHotel() {
        System.out.print("Enter hotel name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hotel location: ");
        String location = scanner.nextLine();

        System.out.print("Enter hotel description: ");
        String description = scanner.nextLine();

        String result = hotelController.addHotel(name, location, description);
        System.out.println(result);
    }

    private static void viewHotelById() {
        System.out.print("Enter hotel ID: ");
        int id = scanner.nextInt();

        Hotel hotel = hotelController.getHotelById(id);
        if (hotel != null) {
            System.out.println("Hotel Details:");
            System.out.println("ID: " + hotel.getId());
            System.out.println("Name: " + hotel.getName());
            System.out.println("Location: " + hotel.getLocation());
            System.out.println("Description: " + hotel.getDescription());
        } else {
            System.out.println("Hotel not found.");
        }
    }

    private static void viewAllHotels() {
        ArrayList<Hotel> hotels = hotelController.getAllHotels();
        if (hotels.isEmpty()) {
            System.out.println("No hotels available.");
        } else {
            System.out.println("Hotels List:");
            for (Hotel hotel : hotels) {
                System.out.println("ID: " + hotel.getId() + " | Name: " + hotel.getName() + " | Location: " + hotel.getLocation());
            }
        }
    }

    private static void updateHotel() {
        System.out.print("Enter hotel ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter new hotel name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new hotel location: ");
        String location = scanner.nextLine();

        System.out.print("Enter new hotel description: ");
        String description = scanner.nextLine();

        String result = hotelController.updateHotel(id, name, location, description);
        System.out.println(result);
    }

    private static void deleteHotel() {
        System.out.print("Enter hotel ID to delete: ");
        int id = scanner.nextInt();

        String result = hotelController.deleteHotel(id);
        System.out.println(result);
    }
}
