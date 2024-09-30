package ui;
import java.util.ArrayList;
import java.util.Scanner;

import controller.BookingController;
import controller.HotelController;
import controller.UserController;
import model.Booking;
import model.Hotel;

public class UserMain {
	private static Scanner sc = new Scanner(System.in);
	private static UserController userController = new UserController();
	private static HotelController hotelController = new HotelController();
	private static BookingController bookingController = new BookingController();
	private static String uName = null;
	
	public static void userMenu() {
		boolean exit = false;
		
		System.out.println("Welcome to HotelEase!");
		
		while(!exit) {
			System.out.println("\nPlease choose an option:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("5. Exit");
			System.out.println("\nPlease choose an option: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				register();
				break;
				
			case 2:
				login();
				break;
				
			case 3:
				updateProfile();
				break;
				
			case 4:
				deleteAccount();
				break;
				
			case 5:
				System.out.println("Exiting the system. Thank you for using HotelEase!");
                exit = true;
                break;
                
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 5.");
			}
		}
	}
	
	private static void register() {
		System.out.println("Enter username: ");
		String username = sc.next();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		System.out.println("Enter email: ");
		String email = sc.next();
		sc.nextLine();
		
		System.out.println("Enter phoneNumber: ");
		String phoneNumber = sc.nextLine();
		
		String result = userController.registerUser(username, password, email, phoneNumber);
		System.out.println(result);
	}
	
	private static void login() {
		boolean exit = false;
		int choice;
		
		System.out.println("Enter username: ");
		String username = sc.next();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		if (userController.loginUser(username, password)) {
			uName = username;
			while(!exit) {
				System.out.println("\nWelcome " + username + ",\n");
				System.out.println("1. Update Profile");
				System.out.println("2. Delete Profile");
				System.out.println("3. Book Hotel");
				System.out.println("4. View your bookings");
				System.out.println("0. Exit");
				System.out.println("\nPlease choose an option: ");
				choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					updateProfile();
					break;
					
				case 2:
					deleteAccount();
					break;
					
				case 3:
					viewAllHotels();
					bookHotel();
					break;
					
				case 4:
					viewBookings();
					break;
					
				case 0:
					System.out.println("Going Back to Main Menu!");
	                exit = true;
	                break;

				default:
					System.out.println("Invalid choice!");
					break;
				}
			}
		} else {
			System.out.println("Invalid username or password.");
		}
	}
	
	private static void updateProfile() {
		System.out.println("Enter userId: ");
		int userId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new password: ");
		String password = sc.next();
		
		System.out.println("Enter new email: ");
		String email = sc.next();
		sc.nextLine();
		
		System.out.println("Enter new phoneNumber: ");
		String phoneNumber = sc.nextLine();
		
		String result = userController.updateUserProfile(userId, password, email, phoneNumber);
		System.out.println(result);
	}
	
	private static void deleteAccount() {
		System.out.println("Enter userId: ");
		int userId = sc.nextInt();
		
		String result = userController.deleteUserAccount(userId);
		System.out.println(result);
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
	
	private static void bookHotel() {		
		System.out.print("Enter hotel ID: ");
        int hotelId = sc.nextInt();
        
        System.out.print("Enter start date (yyyy-mm-dd): ");
        String startDate = sc.next();
        
        System.out.print("Enter end date (yyyy-mm-dd): ");
        String endDate = sc.next();

        boolean success = bookingController.bookHotel(userController.getUserId(uName), hotelId, startDate, endDate, "WAITING");
        if (success) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed.");
        }
	}
	
	private static void viewBookings() {
		System.out.println("Your Bookings:");
        ArrayList<Booking> bookings = bookingController.viewUserBookings(userController.getUserId(uName));
        for (Booking booking : bookings) {
        	System.out.println("Booking ID: " + booking.getId() + 
                    ", Hotel ID: " + booking.getHotel_id() + 
                    ", Start Date: " + booking.getStartDate() + 
                    ", End Date: " + booking.getEndDate() + 
                    ", Status: " + booking.getBooking_status());
		}
	}
}
