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
public class Cat extends Animal {
    
    int age;

    public Cat(String color , int age) {
        super(color);
        this.age=age;
    }
   
    void meuw(){};

    @Override
    void eat(){
        super.eat();
        System.out.println("Cat is eating ");
        
    }
}
