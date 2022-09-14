package exercises;

public class Loops {

	public static void main(String[] args) {
		// for loops
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
				// end //
		
		
		// while loop
		int x = 0;
		while (x <= 10) {
			System.out.println(x);
			x++;	
		}
		
		// do while loop
		do {
			System.out.println(x);
			x++;
		} while (x <= 20);
		
		
	}

}
