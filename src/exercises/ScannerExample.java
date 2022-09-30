package exercises;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Please make a selection: ");
		
		System.out.println("1) This is really difficult!");
		System.out.println("2) This is somewhat difficult.");
		System.out.println("3) This is easy!");
		
		String[] options = new String[3];
		options[0] = "You need to study more.";
		options[1] = "You're on the right track, keep on going.";
		options[2] = "It appears you got it.";
		
		int userSelection = s.nextInt();
		
		while (userSelection < 1 || userSelection > 3) {
			System.out.println("Please make a valid selection.");
			userSelection = s.nextInt();
		}
		
		System.out.println(options[userSelection - 1]);
	 	
	}
}
		



