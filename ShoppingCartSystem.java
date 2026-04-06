package PROJECTS;

import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner;
        int prices[]={2000,5000,8400,3450};
        String items []={"Watch","Ring","Dress","Makeup"};
        int cart[]=new int[10];
        int count=0;
        int total=0;
        while(true){
            System.out.println("<----PRODUCTS MENU------>");
             System.out.println("1: watch--->2000");
              System.out.println("2: Ring--->5000");
               System.out.println("3: Dress--->8400");
                System.out.println("4: Makeup--->3450");
                 System.out.println("Enter Your Choice");
                 int choice=sc.nextInt(); 

        }
    }
}
