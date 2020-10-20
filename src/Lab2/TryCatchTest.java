package Lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTest {

    public static void main (String [] args){

        try {

            FileReader fr = new FileReader("C:\\Users\\pg19edd\\Desktop\\test2.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while (s!=null){ //not end of file??
                System.out.println(s);
                s = br.readLine();
            }//while
            br.close();//close buffered reader stream
            fr.close();//close the file stream

        }//try
        catch (IOException e){ //catch error
            System.out.println(e); //print error message
        }//catch

    }//main
}//class
