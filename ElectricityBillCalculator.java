package PROJECTS;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Electricity Units :");
        int units=sc.nextInt();
            if(units<=100){
                int charge=2;
                int total=units*charge;
                System.out.println("The Electricity  is:"+total);
            }
           else if(units<=200){
                int charge=3;
                int total=units*charge;
                System.out.println("The Electricity  is:"+total);
            }
           else if(units<=300){
                int charge=5;
                int total=units*charge;
                System.out.println("The Electricity bill is :"+total);
            }
            else{
                int charge=7;
                int total=units*charge;
                System.out.println("The Electricity bill is :"+total);

            }
                
            }
        }
    
