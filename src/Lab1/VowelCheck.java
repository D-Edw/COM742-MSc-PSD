package Lab1;
import java.util.Scanner;

/**
 * Created by: Daniel
 * Created on: 21/1/20
 * Program to check if a character entered is a vowel or a consonant.
 */

public class VowelCheck {
    public static void main (String args []){
        Scanner keyboard = new Scanner(System.in);

        //Declare variable
        String input;

        //Ask user to input letter
        System.out.println("Enter a letter: ");
        input = keyboard.nextLine();

        char outcome = input.charAt(0);

        switch (outcome){
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Letter is a vowel");
            break;

            case 'B': case 'C': case 'D': case 'F': case 'G':
            case 'H': case 'J': case 'K': case 'L': case 'M':
            case 'N': case 'P': case 'Q': case 'R': case 'S':
            case 'T': case 'V': case 'W': case 'X': case 'Y':
            case 'Z':
                System.out.println("Letter is a consonant");
             break;

            default: System.out.println("Invalid");
        }//switch





    }//main
}//class
