package Lab5;


import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Practical5Q2 {
    public static void main(String [] args){
        //declare two sets
        Set<String>Months1= new HashSet<>();
        Set<String>Months2= new HashSet<>();

        //populate Months1 set
        Months1.add("Jan");
        Months1.add("Feb");
        Months1.add("March");
        Months1.add("April");
        Months1.add("May");
        Months1.add("June");

        //populate Months2 set
        Months2.add("May");
        Months2.add("June");
        Months2.add("July");
        Months2.add("August");

        //union of sets
        Set<String>union = new HashSet<>();
        union.addAll(Months1);
        union.addAll(Months2);
        System.out.println("Union of Months1 and Months 2: " + union);

        //intersection of sets
        Set<String>intersection = new HashSet<>();
        intersection.addAll(Months1);
        intersection.retainAll(Months2);
        System.out.println("Intersection of Months1 and Months2: " + intersection);

        //check if intersection is empty
        if(intersection.isEmpty()){
            System.out.println("The intersection set is empty");
        }//if
        else{
            System.out.println("The intersection set is not empty");
        }//else

        //determine size of union set
        System.out.println("Size of union set is: " + union.size());



    }//main
}//class
