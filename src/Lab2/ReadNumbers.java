package Lab2;

import java.io.*;

public class ReadNumbers {

    public static int readNumbers(String fname){

        int count = 0;

        try {
            //open file
            FileReader fr = new FileReader("fifty.txt"); //open file
            BufferedReader br = new BufferedReader(fr);

            //initialise count
            String c = br.readLine();

            while (c!= null) {// loop until end of file
                //read number from file and add to count
                count = count + Integer.parseInt(c);
                c = br.readLine();
            }//while

            br.close();
            fr.close();
            System.out.println("Total is: " + count);// print
        }//try
        catch(IOException e){
            System.out.println(e);
        }//catch

        return count;
    }//readNumbers

    public static void main(String args[]){

        readNumbers("fifty.txt");

    }//main


}//class
