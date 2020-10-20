package Lab5;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Practical5Q5 {

    public static void readNumbers(String fname, Set<Integer> set){
     try{
         FileReader fr = new FileReader(fname);
         BufferedReader br = new BufferedReader(fr);
         String line = br.readLine();

         for(int count = 0; count < 20; count ++){
             int c = Integer.parseInt(line);
             set.add(c);
             line = br.readLine();
         }//for
         br.close();
         fr.close();
     }//try
     catch (IOException e){
         System.out.println(e);
     }//catch
    }//readNumbers


    public static void main(String [] args){

        Set<Integer>NumbersA=new HashSet<>();
        readNumbers("U:\\private\\COM742\\NumbersA", NumbersA);
        System.out.println("NumbersA: " + NumbersA);

        Set<Integer>NumbersB=new HashSet<>();
        readNumbers("U:\\private\\COM742\\NumbersB", NumbersB);
        System.out.println("NumbersB: " + NumbersB);

        //Intersection
        Set<Integer>intersection=new HashSet<>();
        intersection.addAll(NumbersA);
        intersection.retainAll(NumbersB);
        System.out.println("Intersection: " + intersection);

        //union
        Set<Integer>union= new HashSet<>();
        union.addAll(NumbersA);
        union.addAll(NumbersB);
        System.out.println("Union: " + union);

        //determine if union contains number 10
        if(union.contains(10)){
            System.out.println("Union contains 10");
        }//if
        else{
            System.out.println("Union does not contain 10");
        }//else

    }//main
}//class
