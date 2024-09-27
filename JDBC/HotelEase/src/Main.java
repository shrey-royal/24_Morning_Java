import java.util.Scanner;

import controller.UserController;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static UserController userController = new UserController();
	
	public static void main(String[] args) {
		boolean exit = false;
		
		System.out.println("Welcome to HotelEase!");
		
		while(!exit) {
			System.out.println("\nPlease choose an option:");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Update Profile");
			System.out.println("4. Delete Profile");
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
		System.out.println("Enter username: ");
		String username = sc.next();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		if (userController.loginUser(username, password)) {
			System.out.println("Login Successful!");
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
}
