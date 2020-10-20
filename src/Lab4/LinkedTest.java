package Lab4;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedTest {

    public static void main(String [] args){

        //linkedNumbers
        LinkedList <Integer> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(1);
        linkedNumbers.add(2);
        linkedNumbers.add(3);
        System.out.println("The numbers are: " + linkedNumbers);

        //linkedNumbers2
        LinkedList <Number> linkedNumbers2 = new LinkedList<>();
        linkedNumbers2.add(new Integer(123));
        linkedNumbers2.add(new Float(3.1415));
        linkedNumbers2.add(new Double(299.988));
        linkedNumbers2.add(new Long (67000));
        System.out.println("The numbers are: " + linkedNumbers2);

        //strList
        LinkedList<String> strList = new LinkedList<>();
        strList.add("Mary");
        strList.add("John");
        strList.add("Peter");
        strList.add("Shane");
        strList.add("Seamus");
        strList.add("James");
        System.out.println("The list is: " + strList);

        //adding to linkedNumbers
        linkedNumbers.add(1, 9);
        System.out.println("Added 9 to index 1: " + linkedNumbers);

        //adding all elements of an existing collection to the end of the list
        LinkedList<Integer> listOdds = new LinkedList<>();
        listOdds.add(9);
        listOdds.add(9);
        listOdds.add(9);
        listOdds.add(9);
        linkedNumbers.addAll(listOdds);
        System.out.println("listOdds: " + linkedNumbers);



    }//main
}//class
