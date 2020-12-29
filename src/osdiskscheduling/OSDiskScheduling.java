/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;
//  C:\Users\G3bour Store\Desktop\s.txt
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class OSDiskScheduling {
    
     

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        
       
               System.out.println("How many disks you want to schedule");
                 int numberOfDisks=sc.nextInt();
                
             
         System.out.println("to input from files enter 1, for console press 2");
            int FoC=sc.nextInt();
            while(FoC<1||FoC>2){
               System.out.println("invalid input, enter again");
               FoC=sc.nextInt();
           }
            ArrayList <Integer> Disks=new ArrayList<Integer>();
      
       
           switch(FoC){
               case 1:
                   String requestsFile=" ";
                   Scanner fileInput=new Scanner(System.in);
                    System.out.println("Enter your pre filled requests values file destination : ");
              
              requestsFile=fileInput.nextLine();
              
              File fl=new File(requestsFile);
              
              Scanner fscvv=new Scanner(fl);
              while(fscvv.hasNext())
              {
            Disks.add(fscvv.nextInt());
            
                }
                   break;
               case 2:
                     System.out.println("Please enter the requests");
                      for(int i=0;i<numberOfDisks;i++){
            
            Disks.add(sc.nextInt());
            
        }
                      break;
               default:
                   System.out.println("No valid choice entered so manual is selected ");
                  System.out.println("Please enter the requests");
                      for(int i=0;i<numberOfDisks;i++){
            
            Disks.add(sc.nextInt());
            
        }
                      
    }
               
         System.out.println("The requests you entered: ");
         for(int i=0;i<numberOfDisks;i++){
             
             System.out.println(Disks.get(i));
         }
        
         System.out.println("Enter your head");
         int head=sc.nextInt();
         
           System.out.println("Enter your boundry");
                  int boundry=sc.nextInt();
                  if(boundry<Disks.get(Disks.size()-1))
        System.out.println("the value of the boundry is less than the largest value in the requests");
                  
         
         System.out.println("for FCFS press 1 ");
         System.out.println("for SSTF press 2");
         System.out.println("for SCAN press 3");
         System.out.println("for C-SCAN press 4");
         System.out.println("for LOOK press 5");
         System.out.println("for C-LOOK press 6");

         int choice= sc.nextInt();
         SCAN Sobj=new SCAN();
         C_SCAN CSobj=new C_SCAN();
         LOOK Lobj=new LOOK();
         C_LOOK CLobj=new C_LOOK();

         switch(choice){
             case 1:
                 
                 FCFS obj=new FCFS();
                 obj.fcfs(Disks, head);
                 break;
             case 2:
                 
                 SSTF obj2=new SSTF();
                 obj2.sstf(Disks, head);
                 break;
             case 3:
                  System.out.println("for Right direction press 1 and for Left direction press 0");
                  int direct= sc.nextInt();
                  
                
                switch(direct){
             case 0:
                 Sobj.scan(Disks,head,direct,boundry);
                break;
             case 1:
                 Sobj.scan(Disks,head,direct,boundry);
                 break;
         } 
                
         
                   break;
             case 4:
                 System.out.println("for Right direction press 1 and for Left direction press 0");
                   direct= sc.nextInt();
                  
                  
        
                  
                  
                switch(direct){
             case 0:
                 CSobj.cScan(Disks,head,direct,boundry);
                break;
             case 1:
                 CSobj.cScan(Disks,head,direct,boundry);
                 break;
         } 
                 
                          
                  break;
             case 5:
                 System.out.println("for Right direction press 1 and for Left direction press 0");
                   direct= sc.nextInt();
                  
                
                switch(direct){
             case 0:
                 Lobj.look(Disks,head,direct,boundry);
                break;
             case 1:
                 Lobj.look(Disks,head,direct,boundry);
                 break;
         } 
                 
              
         break;
         case 6:
                 System.out.println("for Right direction press 1 and for Left direction press 0");
                   direct= sc.nextInt();
                  
                  
        
                switch(direct){
             case 0:
                 CLobj.clook(Disks,head,direct,boundry);
                break;
             case 1:
                 CLobj.clook(Disks,head,direct,boundry);
                 break;
         } 
                 
             
         break;
         
         
         
         
         
         
         
         
         
         
         }
      
    }
    
}
