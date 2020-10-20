package Lab5;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Practical5Q4 {
    public static void main(String [] args){

        //declare array Numbers
        int [] Numbers = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};

        //declare set Numbers2
        Set<Integer>Numbers2= new HashSet<>();

        //for loop
        for(int count= 0; count <Numbers.length; count++){
            Numbers2.add(Numbers[count]);
        }//for

        //print Numbers2 set
        System.out.println("Numbers2 set populated through Numbers array: " + Numbers2);

        //declare set Numbers3
        Set<Integer>Numbers3= new HashSet<>();

        //for loop to multiply by 3
        for (int count2 = 0; count2 < Numbers.length; count2++){
            Numbers3.add(Numbers[count2] * 3);
        }//for

        //print Numbers3 set
        System.out.println("Numbers3 set (by 3): " + Numbers3);


    }//main
}//class
