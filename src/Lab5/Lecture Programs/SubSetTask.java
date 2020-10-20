package Lab5;

import java.util.HashSet;
import java.util.Set;

public class SubSetTask {
    public static void main(String [] args){

        //creating sets
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        //populating s1 with elements
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        //populating s2 with elements
        s2.add(1);
        s2.add(2);
        s2.add(3);

        //determining subsets
        if(s1.containsAll(s2)){
            System.out.println("s2 is a subset of s1");
        }//if
        else{
            System.out.println("s2 is not a subset of s1");
        }//else

        //union of s1 and s2
        s1.addAll(s2);
        System.out.println("s1 after union: " + s1);

        //intersection
        System.out.println("s1 before intersection: " + s1);
        s1.retainAll(s2);
        System.out.println("s1 after intersection: " + s1);


    }//main
}//class
