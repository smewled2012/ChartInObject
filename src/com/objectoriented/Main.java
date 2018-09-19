package com.objectoriented;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FoorLooping foorLooping = new FoorLooping();
        WhileLooping whileLooping = new WhileLooping();
        DoWhileLooping doWhileLooping = new DoWhileLooping();

        System.out.println("\nPlease Enter Your Selection for conversion : " +
                "\nPress 1 for For Loop"+ "\nPress 2 for While Loop "+ "\nPress 3 for Do while "+ "\nPress Q to Quite the program :");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        if(selection ==1){
            System.out.println("You have selected For Loop: ");
            foorLooping.calculateFor();
        }
        else if(selection==2){
            System.out.println("You have selected While Loop : ");
            whileLooping.calculateWhile();
        }
        else if(selection==3){
            System.out.println("you have Selected Do while Loop");
            doWhileLooping.calculateDoWhile();
        }
        else{
            System.out.println("Good Bye the Program is closing !");

        }


    }
}
