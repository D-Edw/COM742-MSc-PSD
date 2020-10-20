package Lab8;

public class SequentialFactorial {

    public static void main(String [] args){
        int answer = 1, number = 5;

        if(number < 0){
            System.out.println("Error - Number has to be positive");
        }//if
        else{
            System.out.println(number);
            for (int loop = number; loop > 1; loop--){
                System.out.println(number);
                answer = answer * loop;
            }//for
            System.out.println("Factorial " + number + " = " + answer);
        }//else


    }//main

}//class
