package Lab8;

public class RecursiveVase {

    public static void emptyVase(int flowersInVase){
        System.out.println(flowersInVase);
        if(flowersInVase > 0){
            emptyVase(flowersInVase - 1);
        }//if
        else{
            System.out.println("The vase is empty");
        }//else
    }//emptyVase

    public static void main(String [] args){

        emptyVase(10);

    }//main

}//class
