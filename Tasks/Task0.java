import java.util.Scanner;

public class Task0 {
	private double total = 0.0;
	private double product = 1.0;
	
	void sum(int n) {
		total += n;
	}
	
	public static void main(String[] args) {
		Task0 t = new Task0();
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter numbers (end with -1): ");
		
		while(true) {
			number = sc.nextInt();
			if(number == -1) break;
			
			if (number%2 == 0) t.sum(number);
		}
		
		System.out.println("\nSum = " + t.total);
	}
}