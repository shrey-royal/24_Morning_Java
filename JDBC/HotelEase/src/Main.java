import java.util.Scanner;

import ui.UserMain;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		
		System.out.println("1. Admin");
		System.out.println("2. User");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			String username, password;
			System.out.println("Enter username: ");
			username = sc.next();
			System.out.println("Enter password: ");
			password = sc.next();
			
			if(username.equals("admin") && password.equals("password")) {
				// 
			} else {
				System.out.println("Invalid Credentials! Please try again!");
			}
			break;
			
		case 2:
			UserMain.userMenu();
			break;

		default:
			break;
		}
	}
}
