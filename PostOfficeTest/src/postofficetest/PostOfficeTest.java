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
public class PostOfficeTest {

  
    public static void main(String[] args) {
     
        
        Postoffice send =new Postoffice("Karabuk post office");
        Postoffice receive =new Postoffice ("Istanbul post office");
        
        
        Post post =new Post("this is message", "Istanbul", "Ankara");
        
        send.sendPost(post);
        receive.receive(post);
        
        
        
        
    }
    
}
