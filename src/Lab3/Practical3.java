package Lab3;

import java.io.*;

public class Practical3 {
    static int [] numbers = {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};

    // swap two elements at specified positions
    private static void swap(int posA, int posB) {
        int tmp = numbers[posA];
        numbers[posA] = numbers[posB];
        numbers[posB] = tmp;
    }//swap

    // bubble sort
    public static void bubbleSort(int count) {
        int comps =0, swaps =0;

        //question6 boolean
        boolean swapped = true;

        for (int out = count-1; out > 0 && swapped; out--) {
            swapped = false;
            for (int in = 0; in < out; in++) {
                comps++;
                if (numbers[in] > numbers[in+1]) {
                    swapped = true;
                    swaps++;
                    swap(in,in+1);
                }//if
            }//for
        }//for
        System.out.println("Comps: "+comps+" Swaps: "+swaps);
    }//bubbleSort

    public static int[] readInArray(String filename, int[] array ){
        try{
            // file readers
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Read each line
            String line = br.readLine();
            final int ARRAY_LENGTH = 10;
            array = new int[ARRAY_LENGTH];

            // Loop to read each line and convert to int
            int index = 0;
            int num;
            while (line != null){
                num = Integer.parseInt(line);
                array[index] = num;
                index++;
                line=br.readLine();
            }//while
            br.close();
            fr.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch
        return array;
    }//readInArray

    public static void main(String [] args){

        //read in file 1 to make array and print
        int [] data = new int [10]; //[10] is length of array
        data = readInArray("/Users/daniel/IdeaProjects/COM742/src/P3File1", data);
        System.out.println("File1 Array: ");
        for (int count = 0; count < data.length; count++){
            System.out.print(data[count] + " ");
        }//for
        System.out.println();

        //read in file 2 to make array and print
        int [] data2 = new int [10]; //[10] is length of array
        data2 = readInArray("/Users/daniel/IdeaProjects/COM742/src/P3File2", data2);
        System.out.println("File2 Array: ");
        for (int count = 0; count < data2.length; count++){
            System.out.print(data2[count] + " ");
        }//for
        System.out.println();

        //read in file 3 to make array and print
        int [] data3 = new int [10]; //[10] is length of array
        data3 = readInArray("/Users/daniel/IdeaProjects/COM742/src/P3File3", data3);
        System.out.println("File3 Array: ");
        for (int count = 0; count < data3.length; count++){
            System.out.print(data3[count] + " ");
        }//for
        System.out.println();

        //bubbleSort file 1
        numbers = readInArray("/Users/daniel/IdeaProjects/COM742/src/P3File1", numbers);
        System.out.println();
        System.out.println("File1 bubbleSort: ");
        bubbleSort(10);
        System.out.println();

        //bubbleSort file 2
        numbers = readInArray("/Users/daniel/IdeaProjects/COM742/src/P3File2", numbers);
        System.out.println("File2 bubbleSort: ");
        bubbleSort(10);
        System.out.println();

        //bubbleSort file 3
        numbers = readInArray("/Users/daniel/IdeaProjects/COM742/src/P3File3", numbers);
        System.out.println("File3 bubbleSort: ");
        bubbleSort(10);
        System.out.println();

    }//main
}//class
