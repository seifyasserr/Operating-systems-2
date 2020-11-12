/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;

import java.util.ArrayList;
import java.util.Scanner;





public class OSDiskScheduling {
    
    static void bubbleSort(ArrayList<Integer> x) {  
        int n = x.size();  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(x.get(j-1) > x.get(j)){  
                                 //swap elements  
                                 temp = x.get(j-1);  
                                 x.set(j-1,x.get(j));  
                                 x.set(j,temp);  
                         }  
                          
                 }}} 
         
    
public static void FCFS (ArrayList<Integer> x,int head){
int seek_time=0;
int distance;
int curr_track;

for(int i=0;i<x.size();i++){
    curr_track=x.get(i);
    distance=Math.abs(curr_track-head);
    seek_time+= distance;
    head=curr_track;
}

 System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Seek Sequence is"); 
  
    for (int i = 0; i < x.size(); i++) 
    { 
        System.out.println(x.get(i)); 
    } 
}


public static void SCAN (ArrayList<Integer> x,int head){
    bubbleSort(x);
int seek_time=0;
int distance;
int curr_track=head;
 ArrayList <Integer> scanUp=new ArrayList<Integer>();
  ArrayList <Integer> scanDown=new ArrayList<Integer>();;
  
for(int i=0;i<x.size();i++){
    if(curr_track<=x.get(i))
    {
    curr_track=x.get(i);
    distance=Math.abs(curr_track-head);
    seek_time+= distance;
    head=curr_track;
    scanUp.add(curr_track);
}
   


}

 System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Seek Sequence is"); 
  
    for (int j = 0; j < scanUp.size(); j++) 
    { 
        System.out.println(scanUp.get(j)); 
    } 
}



    public static void main(String[] args) {
        
     
        Scanner sc=new Scanner(System.in);
        
        
        ArrayList <Integer> Disks=new ArrayList<Integer>();
        
        System.out.println("How many disks you want to schedule");
        int numberOfDisks= sc.nextInt();
        System.out.println("Please enter disks");

        for(int i=0;i<numberOfDisks;i++){
            
            Disks.add(sc.nextInt());
            
        }
        
       
        
         System.out.print("The disks you entered: ");
         for(int i=0;i<numberOfDisks;i++){
             
             System.out.println(Disks.get(i));
         }
        
         System.out.println("Enter your head");
         int head=sc.nextInt();
         
         
         
         System.out.println("for FCFS press 1 and for SCAN press 2");
         
         int choice= sc.nextInt();
         
         switch(choice){
             case 1:
                 FCFS(Disks,head);
             case 2:
                 SCAN(Disks,head);
         }
        
                
        
        
        
    }
    
}
