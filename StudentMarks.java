package PROJECTS;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        int marks[]=new int[3];

         System.out.println("Enter Student marks:");
        int sum=0;
       int n=marks.length;
        for(int i=0;i<n;i++){
             marks[i] = sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("The Total marks of the Studnet is :" +sum);
        int avg=sum/n;
        System.out.println("The average of the student is: "+avg);
            if(avg>=90){
                System.out.println("The Grade for the Student is :A" );
            }
            else if(avg>=80){
                System.out.println("The Grade of The Student is: B");
            }
            else if(avg>=70){
                System.out.println("The Grade of The Student is: C");
            }

            else if(avg>=60){
                System.out.println("The Grade of The Student is: D");
            }
else if (avg>=50){
                System.out.println("The Grade of The Student is: E");
            }
            else{
                System.out.println("The Studnet is Fail");
            }


        }
    }
    
