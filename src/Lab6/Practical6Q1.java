package Lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practical6Q1 {

    public static int[] readNumbers(String filename, int[] array, int arrayLength ){
        try{
            // file readers
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Read each line
            String line = br.readLine();
            array = new int[arrayLength];

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
    }//readNumbers

    public static  int minArrayValue (int [] numbers){
        int minimum = numbers [0];

        for (int count = 1; count < numbers.length; count ++){
            if (numbers[count] < minimum){
                minimum = numbers [count];
            }//if
        }//for

        return minimum;
    }//minArrayValue

    public static  int maxArrayValue (int [] numbers){
        int maximum = numbers [0];

        for (int count = 1; count < numbers.length; count ++){
            if (numbers[count] > maximum){
                maximum = numbers [count];
            }//if
        }//for

        return maximum;
    }//maxArrayValue

    public static void selectionSort(int data[]){
        int in, out, min;
        int comps = 0, swaps = 0;

        for (out = 0; out < data.length-1; out++){
            min = out;
            swaps++;
            for (in = out+1; in < data.length; in++){
                comps++;
                if (data[in] < data[min]){
                    min = in; //new minimum
                }//if
            }//innerLoop

            int tmp = data[out]; //swap items
            data[out] = data[min];
            data[min] = tmp;

        }//outerLoop

        System.out.println();

        //print sorted array
        System.out.println("Selection sort: ");
        for (int count = 0; count < data.length; count++){
            System.out.print(data[count] + " ");
        }//for

        System.out.println();
        System.out.println("Comps: " + comps);
        System.out.println("Swaps: " + swaps);

    }//selectionSort

    public static void insertionSort(int data[]){
        int in, out, temp;
        int comps = 0, swaps = 0;

        for (out=1; out < data.length; out++){
            swaps++;
            temp = data[out];
            for(in=out; in > 0 && data[in-1]>=temp; in--){
                comps++;
                data[in] = data[in-1];
            }//innerLoop
            data[in] = temp;
        }//outerLoop

        System.out.println();
        System.out.println("Insertion Sort: ");
        for (int count = 0; count < data.length; count++){
            System.out.print(data[count] + " ");
        }//for

        System.out.println();
        System.out.println("Comps: " + comps);
        System.out.println("Swaps: " + swaps);

    }//insertionSort

    public static void bubbleSort(int[]data){

        int comps = 0, swaps = 0;

        for(int out = data.length-1; out > 0; out--){
            for(int in = 0; in < out; in++){
                comps++;
                if(data[in] > data[in+1]){
                    swaps++;
                    int tmp = data[in]; //swap items
                    data[in] = data[in+1];
                    data[in+1] = tmp;
                }//if
            }//innerLoop
        }//outerLoop

        System.out.println();
        System.out.println("Bubble Sort: ");
        for (int count = 0; count < data.length; count++){
            System.out.print(data[count] + " ");
        }//for

        System.out.println();
        System.out.println("Comps: " + comps);
        System.out.println("Swaps: " + swaps);
    }//bubbleSort

    public static void main (String [] args){

        //read in new file to make array
        int [] random = new int [0];
        random = readNumbers("U:\\private\\COM742\\Analysis.txt", random, 20);
        for (int count = 0; count < random.length; count++){
            System.out.print(random[count] + " ");
        }//for
        System.out.println();

        //max
        System.out.println("Maximum value is: " + maxArrayValue(random));

        //min
        System.out.println("Minimum value is: " + minArrayValue(random));

        //range
        System.out.println("Range is: " + (maxArrayValue(random) - minArrayValue(random)));

        //bubbleSort
        bubbleSort(random);

        //insertionSort
        insertionSort(random);

        //selectionSort
        selectionSort(random);




    }//main

}//class
