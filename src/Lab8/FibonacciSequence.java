package Lab8;

public class FibonacciSequence {
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }//if
        else if(n == 1){
            return 1;
        }//elseif
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }//else
    }//fibonacci



    public static void main(String [] args){
        fibonacci(5);


    }//main
}//class
