package PROJECTS;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("Enter Your Choice");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter two values");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int add=a+b;
                System.out.println("The addition of two numbers is: "+add);
                
                break;
                case 2:
                System.out.println("enter two values");
                 a=sc.nextInt();
                 b=sc.nextInt();
                int sub=a-b;
                System.out.println("The Subtraction of two numbers is: "+sub);
                
                break;
                case 3:
                System.out.println("enter two values");
                 a=sc.nextInt();
                 b=sc.nextInt();
                int mul=a*b;
                System.out.println("The Multiplication of two numbers is: "+mul);
                
                break;

                case 4:
                System.out.println("enter two values");
                 a=sc.nextInt();
                 b=sc.nextInt();
                int div=a/b;
                System.out.println("The Division of two numbers is: "+div);
                break;
        
            default:
                System.out.println("Invalid Choice!");
                break;
        }

    }
    
}
