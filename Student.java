/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders1;

/**
 *
 * @author lenovo
 */
public class Student {
    String name;
   int midterm;
   int finalExam;
   int id;
    
   float calculate(){
        return midterm*0.4f +finalExam*0.6f;
       
       
   }   
   
   void showAllInfo(){
       System.out.println(name + "  "+ " " + " " +id + " "+ calculate());
   }
   
   
    
}
