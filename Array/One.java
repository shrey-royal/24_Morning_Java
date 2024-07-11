import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class One {
	public static void main(String[] args) throws IOException {
		// int[] arr = new int[10];
		// int[] arr = {1, 2, 3, 4, 5};
		int[] arr;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		
		arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			/*
			System.out.print("Enter arr["+i+"]: ");
			arr[i] = sc.nextInt();
			*/
			
			arr[i] = r.nextInt(100);
			//arr[i] = System.out.println((int)(Math.random() * 100));
		}
		/*
		System.out.print("arr["+size+"] = { ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\b\b }");
		*/
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		sc.close();
	}
}