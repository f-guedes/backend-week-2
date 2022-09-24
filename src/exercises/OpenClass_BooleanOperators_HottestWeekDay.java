package exercises;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OpenClass_BooleanOperators_HottestWeekDay {


	static void hottestDay(double sundayTemp, double mondayTemp, double tuesdayTemp) {


	//Write your conditional statement around these three print statements below this line

		
		if (sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
		    System.out.println("Sunday");
		} else if (mondayTemp > sundayTemp && mondayTemp > tuesdayTemp) {
		    System.out.println("Monday");
		} else {
		    System.out.println("Tuesday");
		}
		
		
	//Write your conditional statement around these three print statements above this line

	}
    
    //Do not change this code below
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sundayTemp, mondayTemp, tuesdayTemp;
		sundayTemp = in.nextDouble();
		mondayTemp = in.nextDouble();
		tuesdayTemp = in.nextDouble();
		hottestDay(sundayTemp, mondayTemp, tuesdayTemp);
	}
}