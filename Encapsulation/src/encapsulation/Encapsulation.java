/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author lenovo
 */
public class Encapsulation {

   
    public static void main(String[] args) {
       Account acc=new Account(1000.000);
       
//       acc.setBalance(15000.000);
        acc.withdrawall(150);
         acc.withdrawall(150);
          acc.withdrawall(150);
           acc.withdrawall(150);
            acc.withdrawall(150);
        

        System.out.println(acc.getBalance());   //buraya tek balance yazdıpımızda private oldupu için hata alırız onun için get methodunu kullanıyorus
        
       
    }
    
}
