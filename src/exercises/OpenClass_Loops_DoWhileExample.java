package exercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OpenClass_Loops_DoWhileExample {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numToAdd = in.nextInt();
        int howManyTimes = in.nextInt();
        int sumResult = 0;

        do {
            sumResult += numToAdd;
            howManyTimes--;
        } while (howManyTimes > 0);

        System.out.println(sumResult);
    }
}