package Lab2;

import java.io.*;

public class Fifty {

    public static void writeToFile (int [] nums, String fname){
        int total = 0;

        try {
            FileWriter fw = new FileWriter(fname);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 1; i <= nums.length; i++){
                pw.println(i);
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

        int [] nums = new int [50];
        writeToFile(nums, "fifty.txt");

    }//main
}//class
