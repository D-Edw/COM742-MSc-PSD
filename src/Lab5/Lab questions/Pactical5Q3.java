package Lab5;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Pactical5Q3 {
    public static void main(String [] args){
        //declare sets
        Set<Integer>Numbers = new HashSet<>();
        Set<Integer>NumbersEven = new HashSet<>();
        Set<Integer>NumbersOdd = new HashSet<>();

        //populate Numbers set
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(6);

        //populate NumbersEven set
        NumbersEven.add(2);
        NumbersEven.add(4);
        NumbersEven.add(6);
        NumbersEven.add(8);
        NumbersEven.add(10);
        NumbersEven.add(12);

        //populateNumbersOdd set
        NumbersOdd.add(1);
        NumbersOdd.add(3);
        NumbersOdd.add(5);
        NumbersOdd.add(7);
        NumbersOdd.add(9);

        //difference between Numbers and NumbersEven
        Set<Integer>difference1=new HashSet<>();
        difference1.addAll(Numbers);
        difference1.removeAll(NumbersEven);
        System.out.println("Difference between Numbers and NumbersEven: " + difference1);

        //difference between Numbers and NumbersOdd
        Set<Integer>difference2=new HashSet<>();
        difference2.addAll(Numbers);
        difference2.removeAll(NumbersOdd);
        System.out.println("Difference between Numbers and NumbersOdd: " + difference2);

        //remove 4 from all sets
        Numbers.remove(4);
        NumbersEven.remove(4);
        NumbersOdd.remove(4);
        System.out.println("Removed 4 from Numbers: " + Numbers);
        System.out.println("Removed 4 from NumbersEven: " + NumbersEven);
        System.out.println("Removed 4 from NumbersOdd: " + NumbersOdd);

        //determine if NumbersEven(B) is a subset of Numbers(A)
        if(Numbers.containsAll(NumbersEven)){
            System.out.println("NumbersEven is a subset of Numbers");
        }//if
        else{
            System.out.println("NumbersEven is not a subset of Numbers");
        }//else


    }//main
}//class
