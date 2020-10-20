package Lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;
import java.io.*;




public class Practical4 {

    public static void readNumbers(String fname, LinkedList<Integer> list){
        try {
            //open file
            FileReader fr = new FileReader("/Users/daniel/IdeaProjects/COM742/src/Practical4Random.txt"); //open file
            BufferedReader br = new BufferedReader(fr);

            //initialise count
            String c = br.readLine();
            int num;

            while (c!= null) {// loop until end of file
                //read number from file and add to count
                num = Integer.parseInt(c);
                list.add(num);
                c = br.readLine();
            }//while

            br.close();
            fr.close();

        }//try
        catch(IOException e){
            System.out.println(e);
        }//catch
    }//readNumbers



    public static int removeFirst(LinkedList<Integer>list){
        int number = list.removeFirst();
        return number;
    }//removeFirst

    public static int[] readInArray(String filename, int[] array ){
        try{
            // Two Classes required for file read
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Read line and convert to int
            String c = br.readLine();
            final int ARRAY_LENGTH = 20;
            array = new int[ARRAY_LENGTH];
            int index = 0;
            int num;

            // Loop through as many times as required
            while (c != null){
                num = Integer.parseInt(c);
                array[index] = num;
                index++;
                c=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        return array;
    }//readInArray

    public static void main(String [] args){

        LinkedList<Integer> listNum = new LinkedList<>();
        readNumbers("/Users/daniel/IdeaProjects/COM742/src/Practical4Random.txt", listNum);
        System.out.println(listNum);
        System.out.println();

        //insert 16 at the first position and 24 at the last position
        listNum.add(0, 16);
        listNum.add(21, 24);
        System.out.println("Added 16 and 24 list: " + listNum);
        System.out.println();

        //get first and last occurrence of 6 and 15
        int firstIndex = listNum.indexOf(6);
        int lastIndex = listNum.lastIndexOf(6);
        int indexFirst = listNum.indexOf(15);
        int indexLast = listNum.lastIndexOf(15);

        if(listNum.contains(6)){
            System.out.println("First occurrence of 6 is: " + firstIndex);
            System.out.println("Last occurrence of 6 is: " + lastIndex);
        }//if
        else{
            System.out.println("Element not found.");
        }//else

        if(listNum.contains(16)){
            System.out.println("First occurrence of 15 is: " + indexFirst);
            System.out.println("Last occurrence of 15 is: " + indexLast);
        }//if
        else{
            System.out.println("Element not found.");
        }//else
        System.out.println();

        //code to display all of the elements and their positions in a linked list
        for(int count = 0; count < listNum.size(); count++){
            System.out.println("Element at index "+count+": " + listNum.get(count));
        }//for
        System.out.println();

        //remove first, last, and 4th element from linked list
        listNum.removeFirst();
        listNum.removeLast();
        listNum.remove(4);
        System.out.println("List after removals: " + listNum);
        System.out.println();

        //swap elements at locations 3 and 16
        Collections.swap(listNum, 3 ,16);
        System.out.println("Swapped index 3 and 16: " + listNum);
        System.out.println();

        //second list containing 6 elements and join to listNum
        LinkedList<Integer> listNum2 = new LinkedList<>();
        listNum2.add(10);
        listNum2.add(20);
        listNum2.add(30);
        listNum2.add(40);
        listNum2.add(50);
        listNum2.add(60);

        listNum.addAll(listNum2);
        System.out.println("Linked lists: " + listNum);
        System.out.println();

        //removeFirst(q8)
        removeFirst(listNum);
        System.out.println(removeFirst(listNum));
        System.out.println();

        //check if 32 exists
        if(listNum.contains(32)){
            System.out.println("32 found");
        }//if
        else{
            System.out.println("32 not found");
        }//else
        System.out.println();

        //return size of list
        System.out.println("Size of list: " + listNum.size());
        System.out.println();

        //add 20 to LIST position 10
        listNum.add(10,20);
        System.out.println("Added 20 to position 10: " + listNum);
        System.out.println();

        //read in new file to make array
        int [] random = new int [20]; //[20] is length of array
        random = readInArray("/Users/daniel/IdeaProjects/COM742/src/Practical4Array", random);
        for (int count = 0; count < random.length; count++){
            System.out.print(random[count] + ", ");
        }//for
        System.out.println();

        //added 20 to ARRAY position 10
        random[10] = 20;
        for (int count = 0; count < random.length; count++){
            System.out.print(random[count] + ", ");
        }//for
        System.out.println();

















    }//main
}//class
