package Lab2;

import java.io.*;

public class Total {

    public static void main(String [] args){

        int total = 0;

        try{
            FileReader fr = new FileReader("C:\\Users\\pg19edd\\Desktop\\test4.txt");
            BufferedReader br = new BufferedReader(fr);

            String c = br.readLine();

            int num;

            while (c!= null){//while not end of file
                num = Integer.parseInt(c);
                total += num;
                System.out.println(num);
                c = br.readLine();

            }//while
            br.close();
            fr.close();

            int d = total;

            FileWriter fw = new FileWriter("C:\\Users\\pg19edd\\Desktop\\test3.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(d);//print double to file
            pw.close();
            bw.close();
            fw.close();
        }//try

        catch(IOException e) {
            System.out.println(e);
        }//catch
        finally {
            System.out.println("Total is: " + total);
        }//finally

    }//main
}//class
