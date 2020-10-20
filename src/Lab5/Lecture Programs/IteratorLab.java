package Lab5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorLab {
    public static void main(String [] args){

        Set<Integer> numbers= new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);

        Iterator<Integer> iterator1 = numbers.iterator();
        while(iterator1.hasNext()){
            int number = iterator1.next();
            System.out.println(number);
        }//while

        Set<Integer> divide = new HashSet<>();

        Iterator<Integer> divider = numbers.iterator();
        while(divider.hasNext()){
            int number2 = divider.next() / 2;
            divide.add(number2);
        }//while

        System.out.println(divide);

    }//main
}//class
