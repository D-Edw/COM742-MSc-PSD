package Lab8;

public class RecursiveWriteNumbers {

    public static void writeNumbers(int aNumber){
        System.out.println(aNumber);
        if(aNumber > 0){
            writeNumbers(aNumber - 1);
        }//if
        else{
            return;
        }//else
    }//writeNumbers

    public static void main(String [] args){
        writeNumbers(10);
    }//main

}//class
