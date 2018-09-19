package com.objectoriented;

import java.util.Scanner;

public class DoWhileLooping {
    private int count =1;
    private final  double convfac = 25.4;

    public void calculateDoWhile(){

        Scanner input = new Scanner(System.in);

        System.out.println("Conversion chart from inch to millimeter using DoWhile Loop !\n ");
        do{
            System.out.println("Please Enter A measurement in inch: ");
            int inch1 = input.nextInt();

            double converted = inch1 * convfac;
            System.out.println(inch1 + "\t"+ converted  );
            count++;

        }while(count<=15);

    }
}
