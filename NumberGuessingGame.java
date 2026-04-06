package PROJECTS;

import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("WELCOME TO NUMBER GUESSING GAME!");
    System.out.println("Are you ready to start the Game:");
    System.out.println("Enter your guess:");
    while(true){
        int guess=sc.nextInt();
        int secretnumber=23;
        if(guess==secretnumber){
            System.out.println("Congratulaions!,You Won the game");
        }
        else if(guess>secretnumber){
            System.out.println("You guess higher number than the secretnumber ");
            System.out.println("Try Again!");
        }
        else{
            System.out.println("You guess is lower than the secretnumber ");
            System.out.println("Try Again!");
        }
    }
}
    
}
