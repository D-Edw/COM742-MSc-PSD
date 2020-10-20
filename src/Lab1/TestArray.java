package Lab1;

/**
 * Test manipulation of an array
 *
 */
public class TestArray {

    public static void main(String[] args) {
        final int MAX = 20; // constant
        int[] list = new int[MAX]; // create array

        fillArray(list); // fill array with data

        printArray(list); // print contents of array

        // calculate and print array average
        System.out.println("List Average = " + averageArray(list));
    }//main

    // fill the array with values
    public static void fillArray(int[] list) {
        for(int i=0; i < list.length; i++) {
            list[i] = i * 10;
        }//for
    }//fillArray

    public static void printArray(int[] list) {
        for(int i=0; i < list.length; i++) {
            System.out.println("List[" + i + "] = " + list[i]);
        }//for
    }//printArray

    public static int averageArray(int[] list) {
        int total = 0;
        for(int i=0; i < list.length; i++) {
            total += list[i];   // same as total = total + list[i];
        }//for
        return total/list.length;
    }//averageArray
}//class

