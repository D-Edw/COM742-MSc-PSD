package Lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadInArrayFromFile {

    public static int[] readInArray(String filename, int[] array ){
        try{
            // file readers
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Read each line
            String line = br.readLine();
            final int ARRAY_LENGTH = 20;
            array = new int[ARRAY_LENGTH];

            // Loop to read each line and convert to int
            int index = 0;
            int num;
            while (line != null){
                num = Integer.parseInt(line);
                array[index] = num;
                index++;
                line=br.readLine();
            }//while
            br.close();
            fr.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch
        return array;
    }//readInArray

    public static void main(String [] args){

        //read in new file to make array
        int [] random = new int [20]; //[20] is length of array
        random = readInArray("/Users/daniel/IdeaProjects/COM742/src/Practical4Array", random);
        for (int count = 0; count < random.length; count++){
            System.out.print(random[count] + " ");
        }//for
        System.out.println();

    }//main

}//class
