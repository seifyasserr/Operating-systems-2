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
public class SORTS {
    
    private int temp;
    public SORTS()
    {
        int temp = 0; 
    }
     public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
public void aBubbleSort(ArrayList<Integer> x) {  
        int n = x.size();  
          
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(x.get(j-1) > x.get(j)){  
                                 //swap elements  
                                 temp = x.get(j-1);  
                                 x.set(j-1,x.get(j));  
                                 x.set(j,temp);  
                         }  
                          
                 }}} 

   
    public void decBubbleSort(ArrayList<Integer> x) {  
        int n = x.size();  
          
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(x.get(j-1) < x.get(j)){  
                                 //swap elements  
                                 temp = x.get(j-1);  
                                 x.set(j-1,x.get(j));  
                                 x.set(j,temp);  
                         }  
                          
                 }}} 
}
