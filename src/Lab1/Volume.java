package Lab1;

import java.io.*;
import java.util.*;
public class Volume {

    public static void main(String[] args) {

        double sphere = volumeSphere(10);
        System.out.println("volume of Sphere= " + sphere);

        double cylinder = volumeCylinder(10, 10);
        System.out.println("volume of Cylinder= " + cylinder);
    }//main

    public static double volumeSphere(int d) {
        double v;

        v = (Math.PI * Math.pow(d, 3)) / 6;
        return v;
    }//volumeSphere

    public static double volumeCylinder(int d, int h) {
        double v;
        v = (Math.PI * Math.pow(d, 2) * h) / 4;
        return v;
    }//volumeCylinder
}//class



