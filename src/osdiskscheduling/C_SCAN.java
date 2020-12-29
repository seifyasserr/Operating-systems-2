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
public class C_SCAN {
     private  int seek_time;
    private int distance;
    private int curr_track;
    SORTS sortObj=new SORTS();

 public C_SCAN()
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
    
    
         
   
public void cScan (ArrayList<Integer> x,int head,int direction,int boundries){
    sortObj.aBubbleSort(x);

int curr_track=head;
  ArrayList <Integer> scanRight=new ArrayList<Integer>();
  ArrayList <Integer> scanLeft=new ArrayList<Integer>();
  
  if(boundries<x.get(x.size()-1))
        System.out.println("");
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

 seek_time=(abs((0)-scanLeft.get(scanLeft.size()-1))+abs(head-(boundries-1))+(boundries-1));
      
  System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Requests Sequence is"); 
  
    for (int j = 0; j < scanRight.size(); j++) 
    { 
        System.out.println(scanRight.get(j)); 
    } 
    //sortObj.decBubbleSort(scanLeft);
      System.out.println("0");
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
  scanRight.add(boundries-1);
  seek_time=abs(abs((0)-head)+abs(scanRight.get(0)-(boundries-1))+(boundries-1));
  //System.out.println("(0-"+scanLeft.get(scanLeft.size()-1)+")+("+head+"-199)");
  System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Requests Sequence is"); 
  
   sortObj.decBubbleSort(scanLeft);
     for (int k = 0; k < scanLeft.size(); k++) 
    { 
        System.out.println(scanLeft.get(k));
        
    }
  sortObj.decBubbleSort(scanRight);
    for (int j = 0; j < scanRight.size(); j++) 
    { 
        System.out.println(scanRight.get(j)); 
    } 
    
  
  
  }
  
  
}

}
