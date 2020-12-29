/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/*******************************************************TESTING PULLING*******************************************************///

public class OSDiskScheduling {
    
     
     

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        
       
               System.out.println("How many disks you want to schedule");
                 int numberOfDisks=sc.nextInt();
                
               
               
           while(numberOfDisks<1||numberOfDisks>2){
               System.out.println("invalid input, enter again");
               numberOfDisks=sc.nextInt();
           }
         System.out.println("to input from files enter 1, for console press 2");
            int FoC=sc.nextInt();
            ArrayList <Integer> Disks=new ArrayList<Integer>();
      
       
           switch(FoC){
               case 1:
                   
                   break;
               case 2:
                     System.out.println("Please enter disks");
                      for(int i=0;i<numberOfDisks;i++){
            
            Disks.add(sc.nextInt());
            
        }
                      break;
               default:
                   System.out.println("No valid choice entered so manual is selected ");
                  System.out.println("Please enter disks");
                      for(int i=0;i<numberOfDisks;i++){
            
            Disks.add(sc.nextInt());
            
        }
                     
        
        
    }
       
     

        
       
        
         System.out.println("The disks you entered: ");
         for(int i=0;i<numberOfDisks;i++){
             
             System.out.println(Disks.get(i));
         }
        
         System.out.println("Enter your head");
         int head=sc.nextInt();
         
         
         
         System.out.println("for FCFS press 1 and for SCAN press 2");
         
         int choice= sc.nextInt();
         SCAN obj2=new SCAN();
         switch(choice){
             case 1:
                 
                 FCFS obj=new FCFS();
                 obj.FCFS(Disks, head);
                 break;
             case 2:
                 System.out.println("for Right direction press 1 and for Left direction press 0");
                  int direct= sc.nextInt();
                  
                  System.out.println("Enter your boundry");
                  int boundry=sc.nextInt();
                  
                switch(direct){
             case 0:
                 obj2.scan(Disks,head,direct,boundry);
                break;
             case 1:
                 obj2.scan(Disks,head,direct,boundry);
                 break;
         } 
                 
         }
        
                
        
        
        
    }
    
}
