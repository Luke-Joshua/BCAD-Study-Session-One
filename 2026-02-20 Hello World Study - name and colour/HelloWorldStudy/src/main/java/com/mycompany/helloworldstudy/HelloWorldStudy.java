/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworldstudy;

import java.util.Scanner;




/**
 *
 * @author Luke
 * 
 */
public class HelloWorldStudy {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String myName = "";
        String favColour = "";
        
        System.out.println("Hi - what is your name? ");//Question - 1
        myName = scan.nextLine();//2 -input
        System.out.println("Hello " + myName);//3
        
        
        System.out.println("What is your favorite colour?");//Question - 4
        favColour = scan.nextLine(); // 5  - input
        System.out.println("Hello '" + myName + "', your fav colour is '" + favColour +"'" ); // 6
    }
}
