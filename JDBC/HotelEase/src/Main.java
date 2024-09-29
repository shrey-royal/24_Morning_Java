import java.util.Scanner;

import ui.AdminMain;
import ui.UserMain;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				String username, password;
				System.out.println("Enter username: ");
				username = sc.next();
				System.out.println("Enter password: ");
				password = sc.next();
				
				if(username.equals("admin") && password.equals("admin")) {
					AdminMain.hotelMenu();
				} else {
					System.out.println("Invalid Credentials! Please try again!");
				}
				break;
				
			case 2:
				UserMain.userMenu();
				break;
			
			case 0:
				System.out.println("Exiting the system. Thank you for using HotelEase!");
				break;

			default:
				break;
			}
		} while (choice != 0);
	}
}
