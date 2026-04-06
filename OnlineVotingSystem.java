package PROJECTS;
import java.util.Scanner;
public class OnlineVotingSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int n=arr.length;
        int mahin=0;
        int arsheen=0;
        int siri=0;
        int divya=0;
        System.out.println("1:Mahin");
        System.out.println("2:Arsheen");
        System.out.println("3:siri");
        System.out.println("4:Divya");
        System.out.println("Vote For The Candidate"); 
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        System.out.println("Voter " + (i+1) + " vote:");
        if(arr[i]==1){
mahin++;
        }
        else if(arr[i]==2){
            arsheen++;
        }
        else if(arr[i]==3){
            siri++;
        }
        else if(arr[i]==4){
divya++;
        }
        else{
            System.out.println("Invalid Choice!");
        }

    }
    System.out.println("Vote Count/n");
    System.out.println("Mahin :" +mahin);
    System.out.println("Arsheen: "+arsheen);
    System.out.println("Siri: "+siri);
    System.out.println("Divya: " +divya);
    int max=Math.max(Math.max(mahin,arsheen),Math.max(siri,divya));
    System.out.println("The Winner Of The Election is \n");
    if(max==mahin){
        System.out.println("Mahin Wins!");
    }
    else if(max==arsheen){
        System.out.println("Arsheen Wins!");
    }
    else if(max==siri){
        System.out.println("Siri Wins!");
    }
    else{
        System.out.println("Divya Wins!");
    }
    
}
}
