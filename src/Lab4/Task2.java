package Lab4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static void main(String [] args){

        //create and populate list called StrList
        LinkedList<String> StrList = new LinkedList<>();
        StrList.add("Mary");
        StrList.add("John");
        StrList.add("Peter");
        StrList.add("Shane");
        StrList.add("Seamus");
        StrList.add("James");
        System.out.println("List: " + StrList);

        //create a sublist of StrList from index 1 to index 4
        List<String> subList = StrList.subList(1,4);
        System.out.println("Sub list: " + subList);

        //reverse StrList
        Collections.reverse(StrList);
        System.out.println("List after reversing: " + StrList);

        //sort the list
        Collections.sort(StrList);
        System.out.println("After sorting: " + StrList);

        //create a list of strings called CopyStrList, copy in StrList
        LinkedList<String> CopyStrList = new LinkedList<>();
        CopyStrList.add("A");
        CopyStrList.add("A");
        CopyStrList.add("A");
        CopyStrList.add("A");
        CopyStrList.add("A");
        CopyStrList.add("A");
        Collections.copy(CopyStrList, StrList);
        System.out.println("Copied list: " + CopyStrList);

        //shuffle CopyStrList
        Collections.shuffle(CopyStrList);
        System.out.println("Copy list after shuffling: " + CopyStrList);

        //search for location of Shane
        int firstIndex = StrList.indexOf("Shane");
        System.out.println("Shane index: " + firstIndex);


    }//main
}//class
