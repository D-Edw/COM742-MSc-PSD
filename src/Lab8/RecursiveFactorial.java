package Lab8;

public class RecursiveFactorial {
    public static int factorial (int number){
        int answer;

        if(number == 0){
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
        factorial(10);
    }//main
}//class
