package Lab2.Practical2;

import java.io.*;


public class Practical2q1 {

    public static int countTotalPositiveValues(String fileName){
        int total = 0;

        try{
            FileReader fr = new FileReader("/Users/daniel/IdeaProjects/COM742/src/Practical2");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine(); //buffered reader readline

            while (s!=null){
                int num = Integer.parseInt(s);
                System.out.println(num);
                s = br.readLine();
                if(num>=0){
                    total = total + num;
                }//if
            }//while
            br.close();
            fr.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch

        return total;
    }//countTotalPositiveValues

    public static void writeToFile(int [] data, String fileName){
        int total = 0;

        try{
            FileWriter fw = new FileWriter("/Users/daniel/IdeaProjects/COM742/src/Practical2b");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int count = 0; count < data.length; count++){
                pw.println(data[count]);
            }//for
            pw.close();
            bw.close();
            fw.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch
    }//writeToFile

    public static void main(String [] args){

        System.out.println("Total of positive values is: " + countTotalPositiveValues("/Users/daniel/IdeaProjects/COM742/src/Practical2"));
        System.out.println();

        int [] numbers = {23, 34, 27, 89, 45, 67};
        writeToFile(numbers, "/Users/daniel/IdeaProjects/COM742/src/Practical2b");

    }//main

}//class
