package exercises;

import java.util.Scanner;

public class OpenClass_Loops_HigherThan10LowerThan100 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int userNumber;
	userNumber = in.nextInt();

    // Enter your code below 
    if (userNumber >= 10 && userNumber <= 100) {
        do {
        System.out.println (userNumber);
        userNumber--;
        } while (userNumber >= 10);
    }
    else {
        System.out.println("Your number is not between 10 and 100.");
    }
    
    
//    Instructor's answer below:
    
//	 if ( userNumber > 100 || userNumber < 10 ) {
//         System.out.println("Your number is not between 10 and 100.");
//     } else {
//         while ( userNumber >= 10 ) {
//             System.out.println(userNumber);
//             userNumber--;
//         }
//     }
    
	}
}

