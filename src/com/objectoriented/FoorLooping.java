package com.objectoriented;
import java.util.Scanner;

public class FoorLooping {
    private final  double convfac = 25.4;

    public void calculateFor() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nConversion chart from inch to millimeter using For Loop !\n ");

        for (int count = 1; count <= 15; count++) {
            System.out.println("Enter the measurement in inch: ");
            int  inch = input.nextInt();
            double converted = inch * convfac;
            System.out.println(inch + "\t"+ converted);

        }
    }
}
