/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postofficetest;

public class Post {
    
    public String message;
    public String sourceAdress;
    public String targetAdress;
    
    Post( String message, String source, String target){
        
        this.message=message;
        this.sourceAdress=source;
        this.targetAdress=target;
    }
    
    public void getName(){
        
    }
    
}
