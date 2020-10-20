package Lab2;

import java.io.*;


public class WriterTest {

    public static void main(String args[]){

        String s = "Total takings = ";
        double d = 123.45;

        try {
            FileWriter fw = new FileWriter("C:\\Users\\pg19edd\\Desktop\\test3.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(s);//print string to file
            pw.println(d);//print double to file
            pw.close();
            bw.close();
            fw.close();
            //close
        }//try

        catch(IOException e){
            System.out.println(e);
        }//catch

    }//main
}//class
