/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osdiskscheduling;
///  C:\Users\G3bour Store\Desktop\s.txt
import static java.lang.Math.abs;
import java.util.ArrayList;
import static javafx.application.Platform.exit;

/**
 *
 * @author Kareem Elantably
 */
public class SSTF {
    private int seek_time;

private int curr_track;
 ArrayList <Integer> ns=new ArrayList<Integer>();
   ArrayList <Integer> deleted=new ArrayList<Integer>();

   
 SORTS sortObj=new SORTS();

public SSTF()
{
seek_time=0;
curr_track=0;
}

    public int getSeek_time() {
        return seek_time;
    }

    public void setSeek_time(int seek_time) {
        this.seek_time = seek_time;
    }


    public int getCurr_track() {
        return curr_track;
    }

    public void setCurr_track(int curr_track) {
        this.curr_track = curr_track;
    }
    
//   
//    public void sstf(ArrayList<Integer> x,int head)
//    {
//        deleted.add(0);
//        int afterCounter=1;
//        int beforeCounter=1;
//       
//        x.add(head);
//        sortObj.aBubbleSort(x);
//         for(int j=0;j<x.size();j++)
//            {
//                ns.add(x.get(j));
//            }
//           
//        for(int i=0;i<ns.size();i++){
//           
//            
//            int  after=0;
//            int before =0;
//           
//                    
//            if(head==ns.get(i))
//            {
//                 if(head==ns.get(0))
//            {
//            head=ns.get(1);
//            i=0;
//            break;
//            }
//                 else{
//              after=ns.get(i+1);
//              before =ns.get(i-1);
//                 }
//               for(int w=0;w<deleted.size();w++){
//            if(after==deleted.get(w))
//            {
//            after=ns.get(i+afterCounter);
//            i=0;
//            break;
//            }
//            else if(before==deleted.get(w))
//                    {
//                       after=ns.get(i+beforeCounter);
//                       i=0;
//                       break;
//                             
//                    }
//                }
//                    System.out.println(head);
//         if((abs(after-head))<abs((before-head)))
//        {
//            
//           // System.out.println((abs(x.get(i+1)-head))+"<"+abs((x.get(i-1)-head)));
//            System.out.println(after);
//            head=after;
//            System.out.println(ns.get(i)+"removed");
//            deleted.add(ns.get(i));
//            i=0;
//              afterCounter=1;
//         beforeCounter=1;
//        }
//         else if((after-head)>abs((before-head)))
//        {     
//           // System.out.println(abs((x.get(i+1)-head))+">"+abs((x.get(i-1)-head)));
//            System.out.println(before);
//            head=before;
//            System.out.println(ns.get(i)+"removed");
//           deleted.add(ns.get(i));
//            i=0;
//              afterCounter=1;
//         beforeCounter=1;
//        }
//        
//        }
//        }
//        
//        
//    }
    public void difference(ArrayList<Integer> x)
    {
    
    }
    
    
     public void sstf(ArrayList<Integer> x,int head)
    {
      
        x.add(head);
        sortObj.aBubbleSort(x);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    }
      

