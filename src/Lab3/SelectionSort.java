package Lab3;

import java.io.*;

public class SelectionSort {

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

            //print each phase
            for(int count = 0; count<data.length; count++){
                System.out.print(data[count] + " ");
            }//for
            System.out.println();
        }//outerLoop

        System.out.println();

        //print sorted array
        for (int count = 0; count < data.length; count++){
            System.out.println(data[count]);
        }//for

        System.out.println();
        System.out.println("Comps: " + comps);
        System.out.println("Swaps: " + swaps);

    }//selectionSort

    public static void main(String [] args){

        int [] data = {3,5,12,34,66,77,90,21,31,1,100,1000,1};
        selectionSort(data);

    }//main
}//class
