package exercises;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OpenClass_BooleanOperators_TeamPlayoffs {

	static void playoffs(int wins, int losses, boolean isFall) {
		// Provide inline hints or outlines for your students
		if ( (wins > losses) && isFall ) {
		    System.out.println("It's looking good for your team to make the playoffs.");
		} else if ( (wins > losses ) && !isFall ) {
		    System.out.println("Your favorite team has promise, but it's too early to tell.");
		} else {
		    System.out.println("It's not looking so good.");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int wins, losses;
		boolean isFall;
		wins = in.nextInt();
		losses = in.nextInt();
		isFall = in.nextBoolean();
		playoffs(wins, losses, isFall);
	}
}