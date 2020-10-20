package Lab3;

import java.io.*;


public class BubbleSort {

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
            for(int count = 0; count<data.length; count++){
                System.out.print(data[count] + " ");
            }//for
            System.out.println();
        }//outerLoop

        System.out.println();

        for (int count = 0; count < data.length; count++){
            System.out.println(data[count]);
        }//for

        System.out.println();
        System.out.println("Comps: " + comps);
        System.out.println("Swaps: " + swaps);
    }//bubbleSort


    public static void main (String [] args){

        int[]data = {100, 1000, 23, 54, 78, 12, 89, 56, 33};
        bubbleSort(data);


    }//main
}//class
