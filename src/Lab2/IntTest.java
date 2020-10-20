package Lab2;

import java.io.*;

public class IntTest {

    public static void main(String args[]){

        try {
            FileReader fr = new FileReader("C:\\Users\\pg19edd\\Desktop\\test4.txt");
            BufferedReader br = new BufferedReader(fr);

            String c = br.readLine();
            int num;
            for (int i=1; i<=10; i++){
                num = Integer.parseInt(c);
                System.out.println(num);
                c=br.readLine();
            }//for
            br.close();
            fr.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch

    }//main
}//class
