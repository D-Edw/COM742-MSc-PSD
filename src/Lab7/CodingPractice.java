package Lab7;

import java.util.Random;

public class CodingPractice {

    public static int array2DMax(int[][] a){
        int max = a[0][0];

        for(int count = 0; count < a[0].length; count++){
            for(int count2 = 0; count2 < a[0].length; count2++){
                if(a[count][count2] > max){
                    max = a [count] [count2];
                }//if
            }//for
        }//for

        return max;
    }//array2DMax

    public static int array2DMin(int [][]a){
        int min = a [0][0];

        for(int count = 0; count < a[0].length; count++){
            for(int count2 = 0; count < a[0].length; count ++){
                if(a[count][count2] < min){
                    min = a[count][count2];
                }//if
            }//for
        }//for
        return min;
    }//array2DMin

    public static int rowSum(int [][]a, int x){
        int row = x;
        int total = 0;

        for(int column = 0; column<a[0].length; column++){
            total = a[row][column] + total;
        }//for
        System.out.println("Total rowSum: " + total);
        return total;
    }//rowSum

    public static int colSum(int [][]a, int x){
        int col = x;
        int total = 0;

        for(int row = 0; row<a[0].length; row++){
            total = a[row][col] + total;
        }//for
        System.out.println("Total colSum: " + total);
        return total;
    }//rowSum

    public static int[] allRowSums(int[][] a){
       int rows = a.length;
       int cols = a[0].length;
       int [] array = new int[rows];

       for (int r = 0; r < rows; r++){
           for(int c = 0; c < cols; c++){
               array[r] += a[r][c];
           }//for
       }//for

        System.out.println("allRowSums: ");
        for(int count = 0; count<array.length; count++){
        System.out.print(array[count] + " ");
        }//for
        System.out.println();
        return array;
    }//allRowSums

    public static int[] allColSums(int[][] a){
        int rows = a.length;
        int cols = a[0].length;
        int [] array = new int[cols];

        for (int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                array[c] += a[r][c];
            }//for
        }//for

        System.out.println("allColSums: ");
        for(int count = 0; count<array.length; count++){
            System.out.print(array[count] + " ");
        }//for
        System.out.println();
        return array;
    }//allColSums

    public static void main(String[] args) {

        Random ran = new Random(0); // Create random num generator object - seed=0
        int [][]a = new int[20][8]; //20 rows, 8 cols

        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){ // nested for loop to go over 2d array

                a[r][c] = ran.nextInt(1000) + 1; // generate random num

                System.out.print(a[r][c] + "\t"); // tab between columns for print
            }//for
            System.out.println(""); // new line between rows for print
        }//for
        System.out.println("Array max = " + array2DMax(a));
        System.out.println("Array min = " + array2DMin(a));

        rowSum(a,3);
        colSum(a,3);
        allRowSums(a);
        allColSums(a);

    }//main

}//class
