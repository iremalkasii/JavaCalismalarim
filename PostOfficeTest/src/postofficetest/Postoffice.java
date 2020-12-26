/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postofficetest;

/**
 *
 * @author lenovo
 */
public class Postoffice {
    
   public String name;
    
    Postoffice( String name){
       this.name=name;
    }
    
   public void sendPost(Post post){
       System.out.println(post.message+ " " +" has been send from"+" "+ post.sourceAdress +" "+ "for" +" "+ post.targetAdress);
       
               
   }
   public void receive(Post post){
       System.out.println(post.message+" " +"from "+ post.sourceAdress+" "+ "has been received by "+ " "+post.targetAdress);
   }
}
