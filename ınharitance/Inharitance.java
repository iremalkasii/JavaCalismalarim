/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınharitance;

public class Inharitance {

    
    public static void main(String[] args) {
        Dog dog =new Dog("green");
        dog.color="blue";
        
        System.out.println(dog.color);
        
   
      Cat cat = new Cat("Black", 5);
        cat.color="white";
        
        System.out.println(cat.color);
    
        BritishShortHair bhs =new BritishShortHair("Grey",2);
       
        System.out.println(bhs.color);
        
        dog.eat();
        cat.eat();
    
    
    }
    
}
