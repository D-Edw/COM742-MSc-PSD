package Lab6;

import java.io.*;

public class NumberFileGenerator {

    public static void writeNumbers(int howMany, String filename){
        // Method not necessary for functioning program, but making generating a
        // set of numbers a lot easier
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            //loop through each character
            for (int i = 0; i <howMany; i++){
                int number = (int) (Math.random() * 100) +1;
                pw.println(number);
            }
            //Closing
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] arg) {
        // In the below segment and call, change the filename and filesize to
        // the required values and run.
        String filename = "U:\\private\\COM742\\Analysis.txt";
        int filesize = 20;
        writeNumbers(filesize, filename);
    }// main
}// class
