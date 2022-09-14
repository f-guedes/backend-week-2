package exercises;

public class Conditionals {

	public static void main(String[] args) {
		// if statement example 1
		String name = "Pam";
		
		if (name == "Pam") {
			System.out.println("Hello Pam!");
		} else {
			System.out.println("Nice try, " + name);
		}
				// end //
		
		
		// if statement example 2
		int age = 14;
		
		if (age >= 16) {
			System.out.println("You can get a driver's license.");
		} else {
			System.out.println("Get outta here, come back in " + (16 - age) + " year(s).");
		}
				// end //
		
		
		// if else
		double gallonOfMilk = 2.65;
		
		if (gallonOfMilk <= 2) {
			System.out.println("I'm buying 2 gallons of milk today.");
		} else if (gallonOfMilk <= 3) {
			System.out.println("I'm buying 1 gallon of milk today.");
		} else {
			System.out.println("Not buying any milk today.");
		}
				// end //
		
		
		//switch statement
		char grade = 'A';
		
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			case 'D':
				System.out.println("60%");
				break;
			default:
				System.out.println("0%");
		}
				// end //
		
		
		// multiple conditions using if (one inside the other)
		if ('a' == 'a') {
			if ('b' == 'b') {
				System.out.println("a is equal to a and b is equal to b");
			} else {
				System.out.println("a is equal to a");
			}
		}
		
		//in the above scenario, if there's only one result possible with no diverging path (no else), it's best practice to flatten the if statements using &&
		if ('a' == 'a' && 'b' == 'b') {
			System.out.println("a is equal to a and b is equal to b");
		}
				// end //
				
		
	}

}
