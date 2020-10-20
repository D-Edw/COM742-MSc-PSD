package Lab5;

import java.util.HashSet;
import java.util.Set;

public class AnimalLectureTask {
    public static void main(String [] args){

        //creating and printing set
        Set<String> animals = new HashSet<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Fish");
        animals.add("Rabbit");
        animals.add("Hamster");
        System.out.println("Animals set: " + animals);

        //printing size of set
        System.out.println("Size of set: " + animals.size());

        //removing cat and printing updated set
        animals.remove("Cat");
        System.out.println("Removed Cat from set: " + animals);

        //if statement to check Pony, and adding if not found
        if(!animals.contains("Pony")){
            System.out.println("Pony not found");
            animals.add("Pony");
            System.out.println("Pony added to set: " + animals);
        }//if

        //printing updated set and its size
        System.out.println("Updated set: " + animals);
        System.out.println("Updated set size: " + animals.size());



    }//main
}//class
