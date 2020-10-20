package Lab1;

import java.io.*;
import java.util.*;
public class Practical1 {

    // main method
    public static void main(String[] args) {

        int start, end, sum;
        String response;
        char input;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter start of range: ");
            start = keyboard.nextInt();
            System.out.println("Enter end of range: ");
            end = keyboard.nextInt();


            sum = sumRange(start, end);
            System.out.println("Total is " + sum);

            System.out.println("Sum another range (Y/N)");
            keyboard.nextLine();
            response = keyboard.nextLine();
            input = response.charAt(0);

        } while (input == 'Y' || input == 'y');

    }//main

    // sum range of numbers specified by parameters a and b
    public static int sumRange(int a, int b) {
        int n, sum;

        if (a > b) {
            n = (a - b) + 1;
        }//if
        else {
            n = (b - a) + 1;
        }//else
        sum = (n * (a + b)) / 2;
        return sum;
    }//sumRange

}//class

