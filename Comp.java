/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companytest;

/**
 *
 * @author lenovo
 */
class Comp {
      Employee[] employees;
        CompanyName companyName;
        
         Comp (CompanyName cName, Employee[] emps){
            this.companyName=cName;
            this.employees= emps;
            
        }
         
         public Employee[] getAllEmployees(){
             return employees;
      
    }
         public CompanyName getCompanyName(){
             return companyName;
    
}
         
         public void printAllEmployees(){
             for(Employee e: employees){
                 System.out.println(e.getName()+": "+ getCompanyName());
             }
         }

}
