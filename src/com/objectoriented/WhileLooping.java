package com.objectoriented;

import java.util.Scanner;

public class WhileLooping {
    private int count =1;
    private final  double convfac = 25.4;

    public void calculateWhile(){

        Scanner input = new Scanner(System.in);

        System.out.println("Conversion chart from inch to millimeter using While Loop !\n ");
        while(count<15){
            System.out.println("Please Enter A measurement in inch : ");
            int inch = input.nextInt();

            double converted = inch * convfac;

            System.out.println(inch + "\t"+ converted  );
            count++;
        }


    }
}
