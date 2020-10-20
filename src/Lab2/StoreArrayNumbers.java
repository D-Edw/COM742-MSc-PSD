package Lab2;

import java.io.*;

public class StoreArrayNumbers {

    public static void writeToFile (int [] nums, String fname){
        int total = 0;

        try {
            FileWriter fw = new FileWriter(fname);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 0; i < nums.length; i++){
                pw.println(nums[i]);
            }//for
            pw.close();
            bw.close();
            fw.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch
    }//writeToFile



    public static void main(String args[]){

        int[]nums = {2, 4, 7, 12, 67, 2};

        try {
            FileWriter fw = new FileWriter("C:\\Users\\pg19edd\\Desktop\\fifty.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 0; i < nums.length; i++) {
                pw.println(nums[i]);
            }//for

            pw.close();
            bw.close();
            fw.close();
        }//try

        catch(IOException e){
            System.out.println(e);
        }//catch

        int [] data = {23,34,27,89,45,67};
        writeToFile(data, "C:\\Users\\pg19edd\\Desktop\\numbers.txt");

    }//main
}//class
