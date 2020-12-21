/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessmodifiers;


public class Student {
 
     public int id;
     public String name;
     public float  midterm;
     public float finalExam ;
    

public Student(){
         System.out.println("hello from constructor");
         
     }
      
     public Student( String name,float midterm,float finalExam){
         
         this.name=name;
         this.midterm=midterm;
         this.finalExam=finalExam;
         
     }
     public float getResult(){
         return midterm*0.4f +finalExam*0.6f;
     }
}
     
     
