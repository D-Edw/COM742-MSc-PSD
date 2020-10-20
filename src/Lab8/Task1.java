package Lab8;
import java.util.Scanner;

public class Task1 {
    public static int factorial (int number){
        int answer;

        if (number <= 0){
            answer = 1;
        }//if
        else{
            answer = number * factorial(number - 1);
            System.out.println("Number: " + number);
            System.out.println("Answer: " + answer);
            System.out.println();
        }//else
        return answer;
    }//factorial

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = keyboard.nextInt();
        if(number > 0){
            factorial(number);
        }//if
        else {
            System.out.println("Number must be positive");
        }//else
    }//main
}//class
