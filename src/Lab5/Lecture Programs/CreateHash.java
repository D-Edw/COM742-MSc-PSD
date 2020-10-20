package Lab5;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CreateHash {
    public static void main(String [] args){

        //creating a new set
        Set<Integer>numbers = new HashSet<>();
        //adding values
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //printing set
        System.out.println(numbers);

        //names set
        Set<String>names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Tom");
        System.out.println(names);

        //if statements to check if names are added
        if(names.add("Peter")){
            System.out.println("Peter is added to the set");
        }//if

        if(!names.add("Tom")){
            System.out.println("Tom is already added to the set");
        }//if

        System.out.println(names);

    }//main
}//class
