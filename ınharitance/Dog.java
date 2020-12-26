/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınharitance;

/**
 *
 * @author lenovo
 */
public class Dog extends Animal{
    String breed;

    public Dog(String color) {
        super(color);
    }
    void bark(){}
    
    @Override
    void eat(){
        super.eat();
        System.out.println("Dog is eating");
        
        
        
    }

}
