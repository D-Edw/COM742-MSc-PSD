package Lab1;

import java.io.IOException;

/**
 * Created by: Daniel
 * Created on: 21/1/20
 * Program to set and calculate variables
 */

public class PQRST {

    public static void main (String args []) throws IOException {
        int p=7, q=4, t;

        int r = (3*p) + (4*q);

        int s = (5*p) + (6*r);

        if (r > s){
            t = p + q + r;
        }//if
        else{
            t = p + q + s;
        }//else

        System.out.println("Variable p = " + p);
        System.out.println("Variable q = " + q);
        System.out.println("Variable r = " + r);
        System.out.println("Variable s = " + s);
        System.out.println("Variable t = " + t);

    }//main
}//class

