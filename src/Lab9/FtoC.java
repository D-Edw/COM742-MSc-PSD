package Lab9;

public class FtoC {

    public static double CelsiusToFahrenheit(int celsius){

        double fahrenheit = (9.0 /5) * celsius + 32;

        return fahrenheit;

    }//CelsiusToFahrenheit

    public static void main(String [] args){

        System.out.print("Fahrenheit: " + CelsiusToFahrenheit(5) + "f");



    }//main
}//class
