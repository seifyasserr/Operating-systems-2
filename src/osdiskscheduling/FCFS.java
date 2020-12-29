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
public class FCFS {
   private int seek_time;
private int distance;
private int curr_track;
public FCFS()
{
seek_time=0;
distance=0;
curr_track=0;
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
    
    public void fcfs (ArrayList<Integer> x,int head){


for(int i=0;i<x.size();i++){
    
    curr_track=x.get(i);
    distance=Math.abs(curr_track-head);
    seek_time+= distance;
    head=curr_track;
}

 System.out.println("Total number of seek operations = " +  
                        seek_time); 
  System.out.println("Requests Sequence is"); 
  
    for (int i = 0; i < x.size(); i++) 
    { 
        System.out.println(x.get(i)); 
    } 
}

}
