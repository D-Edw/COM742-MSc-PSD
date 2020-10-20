package Lab4;

import java.util.LinkedList;

public class Task1 {

    public static void main(String [] args){

        //create list of integers called numList
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(2);
        numList.add(4);
        numList.add(8);
        numList.add(16);
        numList.add(32);
        numList.add(64);
        System.out.println("List is: " + numList);

        //add 128 to the end of the list
        numList.add(128);
        System.out.println("Added 128: " + numList);

        //create list of integers called numbers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        System.out.println("Numbers: " + numbers);

        //insert 'numbers' into numList as position 3
        numList.addAll(3, numbers);
        System.out.println("numList plus numbers: " + numList);

        //determine which element is at position 5 of the new set
        System.out.println("Position 5: " + numList.get(5));

        //replace the value at location 6 with 23
        numList.set(6, 23);
        System.out.println("Updated list: " + numList);

        //remove the value 16 from the set
        numList.remove(new Integer(16));
        System.out.println("Removed 16: " + numList);

        //print each element of the set on a new line
        numList.forEach(s -> System.out.println(s));




    }//main
}//class
