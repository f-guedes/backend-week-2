package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OpenClass_Conditionals_NumberOfDigits {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        
        //write your conditional statement below this line
        if (num >= 10 && num < 100) {
            System.out.println(num + " is a two digit number");
        } else if (num >= 100 && num < 1000) {
            System.out.println(num + " is a three digit number");
        } else if (num >= 1000 && num < 10000) {
            System.out.println (num + " is a four digit number");
        } else if (num >= 10000 && num < 100000){
            System.out.println (num + " is a five digit number");
        } else {
            System.out.println ("Your number is smaller than 10 or larger than 99999.");
        }
        
        
        
        
    }
}