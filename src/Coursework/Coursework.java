package Coursework;

/**
 * Author: Daniel Edwards
 * Email: edwards-d7@ulster.ac.uk
 * Date: 30/12/2019
 * Description: Coding Sprint Starter Code
 */

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileReader;

public class Coursework {


    public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers
        */
        int[] numbers = new int[1];

        try {

            FileReader fr = new FileReader("/Users/Daniel/Desktop/practice.txt");
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            numbers = new int[size];
            System.out.println(numbers.length);

            for (int i = 0; i < size; i++) {

                c = br.readLine();
                numbers[i] = Integer.parseInt(c);
                System.out.println(numbers[i]);
            }//for

            br.close();
            fr.close();
        }//try
        catch (IOException e) {
            System.out.println(e);
        }//catch
        return numbers;
    }//readArrayFromFile

    public static void swap(int[] numbers, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */
        int tmp = numbers[posA];
        numbers[posA] = numbers[posB];
        numbers[posB] = tmp;
    }//swap


    public static void bubbleSort(int[] numbers) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */
        int ncomps=0, nswaps=0; // declare and initialise counters
        for (int out = numbers.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                ncomps++; // increment number of comparisons
                if (numbers[in] > numbers[in+1]) {
                    nswaps++;  // increment number of swaps
                    swap(numbers, in, in+1);
                }//if
            }//for
        }//for
        System.out.println("Comps="+ncomps+" Swaps="+nswaps);
    }//bubbleSort

    //total number of positive values
    public static int positiveValues (int [] numbers){
        int positiveTotal = 0;
        for (int count = 0; count < numbers.length; count ++){
            if (numbers[count] >= 0) {
                positiveTotal ++;
            }//if
        }//for

        return positiveTotal;
    }//positiveValues

    //total number of negative values
    public static int negativeValues (int [] numbers){
        int negativeTotal = 0;
        for (int count = 0; count < numbers.length; count ++){
            if (numbers[count] < 0) {
                negativeTotal ++;
            }//if
        }//for

        return negativeTotal;
    }//negativeValues

    //total number of zero values
    public static int countZeroValues (int [] numbers){
        int zeroTotal = 0;
        for (int count = 0; count < numbers.length; count ++){
            if (numbers[count] == 0) {
                zeroTotal ++;
            }//if
        }//for

        return zeroTotal;
    }//countZeroValues

    //minimum value in array
    public static  int minArrayValue (int [] numbers){
        int minimum;

        minimum = numbers [0];

        for (int count = 1; count < numbers.length; count ++){
            if (numbers[count] < minimum){
                minimum = numbers [count];
            }//if
        }//for

        return minimum;
    }//minArrayValue

    //maximum value in array
    public static  int maxArrayValue (int [] numbers){
        int maximum;

        maximum = numbers [0];

        for (int count = 1; count < numbers.length; count ++){
            if (numbers[count] > maximum){
                maximum = numbers [count];
            }//if
        }//for

        return maximum;
    }//maxArrayValue

    //mean value
    public static double meanArrayValue(int [] numbers){
        double total = 0;
        double mean;

        for(int count = 0; count < numbers.length; count++){
            total = total + numbers[count];
        }//for

        mean = total / numbers.length;

        return mean;
    }//meanArrayValue

    public static double medianArrayValue(int[] numbers) {
        double median;

        // get count of values
        int totalValues = numbers.length;

        // check if total number of values is even
        if (totalValues % 2 == 0) {
            int sumOfMiddleValues = numbers[totalValues / 2] +
                    numbers[totalValues / 2 - 1];

            // calculate average of middle values
            median = ((double) sumOfMiddleValues) / 2;
        } //if
        else {
            // get the middle element
            median = (double) numbers[numbers.length / 2];
        }//else
        return median;
    }//medianArrayValue

    public static int modeArrayValue(int [] numbers) {

        int mode = numbers [0];
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers [j] == numbers [i]){
                    count++;
                }//if
            }//for

            if (count > maxCount) {
                maxCount = count;
                mode = numbers [i];
            }//if
        }//for
        return mode;
    }//modeArrayValue

    public static int binarySearch(int numbers[], int first, int last, int key){

        int mid = (first + last)/2;

        while( first <= last ){
            if ( numbers[mid] < key ){
                first = mid + 1;
            }//if
            else if ( numbers[mid] == key ){
                System.out.println("Location of key: " + mid);
                break;
            }//else if
            else{
                last = mid - 1;
            }//else
            mid = (first + last)/2;
        }//while
        if ( first > last ){
            System.out.println("Element is not found: -1");
        }//if
        return last;
    }//binarySearch


    public static void main(String[] args) {

        int positiveTotal;
        int negativeTotal;
        int zeroTotal;
        int minimum;
        int maximum;
        double mean;
        double median;
        int mode;


        // Read array from file
        int[] numbers = readArrayFromFile("/Users/Daniel/Desktop/practice.txt");

        readArrayFromFile("/Users/Daniel/Desktop/practice.txt");
        swap(numbers, 0, 0);
        bubbleSort(numbers);

        //print positive values total
        positiveTotal = positiveValues(numbers);
        System.out.println("Number of positive values is: " + positiveTotal);

        //print negative values total
        negativeTotal = negativeValues(numbers);
        System.out.println("Number of negative values is: " + negativeTotal);

        //print zero values total
        zeroTotal = countZeroValues(numbers);
        System.out.println("Number of zero values is: " + zeroTotal);

        //print maximum value
        maximum = maxArrayValue(numbers);
        System.out.println("Maximum value is: " + maximum);

        //print minimum value
        minimum = minArrayValue(numbers);
        System.out.println("Minimum value is: " + minimum);

        //print mean value
        mean = meanArrayValue(numbers);
        System.out.println("Mean value is: " + mean);

        //print median value
        median = medianArrayValue(numbers);
        System.out.println("Median value is: " + median);

        //print mode value
        mode = modeArrayValue(numbers);
        System.out.println("Mode value is: " + mode);

        //binary search
        int key = 3555318;
        int last=numbers.length-1;
        binarySearch(numbers,0,last,key);


    }//main




}//class
