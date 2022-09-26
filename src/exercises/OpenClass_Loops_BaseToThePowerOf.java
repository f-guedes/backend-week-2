package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OpenClass_Loops_BaseToThePowerOf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int power = in.nextInt();
        int result = 1;

        for(int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Result: "+ result);
    }
}