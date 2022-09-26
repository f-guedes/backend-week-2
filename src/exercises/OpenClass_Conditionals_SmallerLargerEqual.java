package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OpenClass_Conditionals_SmallerLargerEqual {

    public static void main(String[] args) {
        //Do not change code below
        int num1 = 156;
        Scanner in = new Scanner(System.in);
        int myNumber = in.nextInt();
        //Do not change code above


        // create your if else statment below that checks to see if myNumber is less than, or 
        // greater than, or
        // equal to randomNumber
        if (num1 < myNumber){
            System.out.println(num1 + " is smaller than my number, " + myNumber);
        } else if (num1 > myNumber){
            System.out.println(num1 + " is larger than my number, " + myNumber);
        } else {
            System.out.println(num1 + " is equal to my number, " + myNumber);
        }
    }
}