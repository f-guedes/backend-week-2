package exercises;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Scanner example
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		
		System.out.println("Welcome, " + name + "!");
		System.out.println();
		
		int selection = 0;
		double total = 0;
		
		while (selection !=6) {
			System.out.println("Please select which product(s) you would like to add to your shopping cart:");
			System.out.println();
			System.out.println("1) 15 ft Extension Cord with 2 USB-C Ports: $24.99");
			System.out.println("2) 16GB RAM Kit (2x8GB) DDR4 3200MHz: $46.25");
			System.out.println("3) KVM Switch HDMI 2 Port Box: $34.79");
			System.out.println("4) Heavy Duty Dual Monitor Desk Mount: $52.10");
			System.out.println("5) Wireless Keyboard and Mouse Combo: $65.35");
			System.out.println("6) Check out");
		
			selection = s.nextInt();
			
			switch (selection) {
				case 1:
					total += 24.99;
					break;
				case 2:
					total += 46.25;
					break;
				case 3:
					total += 34.79;
					break;
				case 4:
					total += 52.10;
					break;
				case 5:
					total += 65.35;
					break;
				case 6:
					break;
				default:
					System.out.println("Please choose a valid option.");
		}

				
		}
		
		System.out.printf("Your total is $%.2f", total);

	}

}