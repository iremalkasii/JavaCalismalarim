
package encapsulation;

import java.util.Scanner;

public class Account {
    private double balance;
  
    
    public Account(double balance){
        this.balance=balance;
    }
    public void setBalance(double balance){
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please the enter passwd: ");
        
        String passwd = scanner.next();
        
            if(passwd.equals("963"))
                this.balance= balance;
            else
                System.out.println("You dont have permission for changing account");
    }
    int counter;
    
    public void withdrawall(double amount){
        int counter = 0;
        if(amount<=this.balance && ++counter <=3)
           this.balance -= amount;
        else
            System.out.println("You reached limit.Please come tomorrow.");
        
        
    }
    
    
    
    
    public double getBalance(){
        return balance;
    }
    
    
    
}



