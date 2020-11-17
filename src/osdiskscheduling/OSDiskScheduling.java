/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;



public class OSDiskScheduling {
    
     
     

    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("C:\\\\Users\\\\G3bour Store\\\\Desktop\\\\os2File");
        Scanner fsc=new Scanner(f);
     
        Scanner sc=new Scanner(System.in);
        
        
        ArrayList <Integer> Disks=new ArrayList<Integer>();
        
        System.out.println("How many disks you want to schedule");
        int numberOfDisks= sc.nextInt();
        System.out.println("Please enter disks");
        // switch case
        for(int i=0;i<numberOfDisks;i++)
       {
           Disks.add(fsc.nextInt());
       
       }
        
        
       
/*        for(int i=0;i<numberOfDisks;i++){
            
            Disks.add(sc.nextInt());
            
        }
*/
        
       
        
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
