package com.mycompany.helloworldstudy;

import java.util.Scanner;

public class HelloWorldStudy {
    
    public static int SquareNumber(int numberA, int powerTimes){
        
        return (int) Math.pow((double) numberA, (double) powerTimes);
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String myName = "";
        String favColour = "";
        int myAge = 0;
        
        System.out.println("Hi - what is your name? ");//Question - 1
        myName = scan.nextLine();//2 -input
        System.out.println("Hello " + myName);//3
        
        
        System.out.println("What is your favorite colour?");
        favColour = scan.nextLine(); 
        System.out.println("Hello '" + myName + "', your fav colour is '" + favColour +"'" );
        
        System.out.println("What is your age?");
        myAge = scan.nextInt(); 
        System.out.println("Hello '" + myName + "', your fav colour is '" + favColour +"'" );
    }
}
