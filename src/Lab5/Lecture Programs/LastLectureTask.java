package Lab5;

import java.util.HashSet;
import java.util.Set;

public class LastLectureTask {
    public static void main(String [] args){
        //create sets
        Set<Integer>A=new HashSet<>();
        Set<Integer>B=new HashSet<>();

        //add elements to A
        A.add(20);
        A.add(30);
        A.add(40);
        A.add(50);

        //add elements to B
        B.add(60);
        B.add(61);
        B.add(62);
        B.add(63);
        B.add(64);
        B.add(65);

        //determining subsets
        if(B.containsAll(A)){
            System.out.println("A is a subset of B");
        }//if
        else{
            System.out.println("A is not a subset of B");
        }//else

        //union
        Set<Integer>union= new HashSet<>();//create new union set
        union.addAll(A);
        union.addAll(B);
        System.out.println("Union of A and B: " + union);

        //intersection
        Set<Integer>intersection = new HashSet<>();//create new intersection set
        intersection.addAll(A);
        intersection.retainAll(B);
        System.out.println("A before intersection " + A);
        System.out.println("Intersection of A and B: " + intersection );

    }//main
}//class
