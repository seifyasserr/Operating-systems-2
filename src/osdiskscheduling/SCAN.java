/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;

import java.util.ArrayList;

/**
 *
 * @author Kareem Elantably
 */
public class SCAN {
    
    private  int seek_time;
    private int distance;
    private int curr_track;
    SORTS sortObj=new SORTS();
    public SCAN()
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
    
    
         
   
public void scan (ArrayList<Integer> x,int head,int direction,int boundries){
    sortObj.aBubbleSort(x);

int curr_track=head;
  ArrayList <Integer> scanRight=new ArrayList<Integer>();
  ArrayList <Integer> scanLeft=new ArrayList<Integer>();
  
  if(direction==1)
  {
       System.out.println("Direction : Right");
  for(int i=0;i<x.size();i++){
    if(curr_track<x.get(i))
    {
    
        scanRight.add(x.get(i));
        curr_track=x.get(i);
}
    else
    {
        scanLeft.add(x.get(i));
       
    }
  }
  scanRight.add(boundries-1);

 seek_time=((boundries-1)-head)+((boundries-1)-x.get(0));
  System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Seek Sequence is"); 
  
    for (int j = 0; j < scanRight.size(); j++) 
    { 
        System.out.println(scanRight.get(j)); 
    } 
    sortObj.decBubbleSort(scanLeft);
     for (int k = 0; k < scanLeft.size(); k++) 
    { 
        System.out.println(scanLeft.get(k)); 
    }
    
  }
  else if(direction==0)
  {
      System.out.println("Direction : Left");
      scanLeft.add(0);
  for(int i=0;i<x.size();i++){
    if(curr_track<x.get(i))
    {
    
        scanRight.add(x.get(i));
        curr_track=x.get(i);
}
    else
    {
        scanLeft.add(x.get(i));
       
    }
  }
  
  seek_time=head+x.get((x.size()-1));
  System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Seek Sequence is"); 
  
   sortObj.decBubbleSort(scanLeft);
     for (int k = 0; k < scanLeft.size(); k++) 
    { 
        System.out.println(scanLeft.get(k));
        
    }
  
    for (int j = 0; j < scanRight.size(); j++) 
    { 
        System.out.println(scanRight.get(j)); 
    } 
   
  
  
  }
  
  
}
    
    
    
}
