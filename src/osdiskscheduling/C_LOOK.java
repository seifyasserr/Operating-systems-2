/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;

import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Kareem Elantably
 */
public class C_LOOK {
     private  int seek_time;
    private int distance;
    private int curr_track;
    SORTS sortObj=new SORTS();
    public C_LOOK()
    {
      
      int seek_time=0;
     int distance=0;
     int curr_track=0;
    }

    public int getSeek_time() {
        return seek_time;
    }

    public void setSeek_time(int seek_time) {
        this.seek_time = seek_time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCurr_track() {
        return curr_track;
    }

    public void setCurr_track(int curr_track) {
        this.curr_track = curr_track;
    }
    
    
         
   
public void clook (ArrayList<Integer> x,int head,int direction,int boundries){
    sortObj.aBubbleSort(x);

int curr_track=head;
  ArrayList <Integer> lookRight=new ArrayList<Integer>();
  ArrayList <Integer> lookLeft=new ArrayList<Integer>();
  
  if(boundries<x.get(x.size()-1))
        System.out.println("");
  if(direction==1)
  {
       System.out.println("Direction : Right");
  for(int i=0;i<x.size();i++){
    if(curr_track<x.get(i))
    {
    
        lookRight.add(x.get(i));
        curr_track=x.get(i);
}
    else
    {
        lookLeft.add(x.get(i));
       
    }
  }

 seek_time=(lookRight.get((lookRight.size()-1))-head)+(lookRight.get((lookRight.size()-1))-lookLeft.get(0))+(lookLeft.get(lookLeft.size()-1)-lookLeft.get(0));
  System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Requests Sequence is"); 
  
    for (int j = 0; j < lookRight.size(); j++) 
    { 
        System.out.println(lookRight.get(j)); 
    } 
    
         sortObj.aBubbleSort(lookLeft);

    for (int k = 0; k < lookLeft.size(); k++) 
    { 
        System.out.println(lookLeft.get(k)); 
    }
  }
  else if(direction==0)
  {
      System.out.println("Direction : Left");
    
  for(int i=0;i<x.size();i++){
    if(curr_track<x.get(i))
    {
    
        lookRight.add(x.get(i));
        curr_track=x.get(i);
}
    else
    {
        lookLeft.add(x.get(i));
       
    }
  }
  seek_time=(abs(lookLeft.get(0)-head)+abs(lookLeft.get(0)-lookRight.get(lookRight.size()-1))+abs(lookRight.get(0)-lookRight.get(lookRight.size()-1)));
  
  System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Requests Sequence is"); 
  //43  173  118
   sortObj.decBubbleSort(lookLeft);
     for (int k = 0; k < lookLeft.size(); k++) 
    { 
        System.out.println(lookLeft.get(k));
        
    }
  
   
      sortObj.decBubbleSort(lookRight);

  for (int j = 0; j < lookRight.size(); j++) 
    { 
       
        System.out.println(lookRight.get(j)); 
    } 
  
  }
  
  
}
    
    

}