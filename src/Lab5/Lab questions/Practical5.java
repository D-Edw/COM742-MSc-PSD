package Lab5;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Practical5 {
    public static void main(String [] args){
        //q1
        Set<Integer>A= new HashSet<>();
        Set<Integer>B= new HashSet<>();

        //populate A
        A.add(24);
        A.add(26);
        A.add(28);
        A.add(30);
        A.add(32);

        //populate B
        B.add(30);
        B.add(32);
        B.add(35);
        B.add(40);
        B.add(45);
        B.add(50);

        //iterate through and print A
        Iterator<Integer> iterator1 = A.iterator();
        System.out.println("Set A:");
        while(iterator1.hasNext()){
            int number = iterator1.next();
            System.out.println(number);
        }//while

        System.out.println();

        //iterate through and print B
        Iterator<Integer> iterator2 = B.iterator();
        System.out.println("Set B: ");
        while(iterator2.hasNext()){
            int number2 = iterator2.next();
            System.out.println(number2);
        }//while

        System.out.println();

        //add 34 to each set
        A.add(34);
        B.add(34);
        System.out.println();

        //union of both sets
        Set<Integer>union = new HashSet<>();
        union.addAll(A);
        union.addAll(B);
        System.out.println("Union of sets A and B: " + union);

    }//main
}//class
