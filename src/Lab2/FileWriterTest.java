package Lab2;

import java.io.*;

public class FileWriterTest {

    public static void main(String [] args){

        String s = "A string to write to a file";

        try {
            FileWriter fw = new FileWriter("C:\\Users\\pg19edd\\Desktop\\test3.txt");
            for (int i=0; i<s.length(); i++){
                int c = s.charAt(i);//extract char from s
                fw.write(c);//write char to file
            }//for
            fw.close();
        }//try
        catch(IOException e){
            System.out.println(e);
        }//catch

    }//main
}//class
