package Lab3;

public class InsertionSort {

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
            //print each phase
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

    }//insertionSort

    public static void main(String [] args){
        int [] data = {4,3,2,10,12,1,5,6};
        insertionSort(data);



    }//main

}//class
