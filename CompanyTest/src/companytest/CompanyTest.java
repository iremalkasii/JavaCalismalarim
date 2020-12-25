/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companytest;
 enum CompanyName{
  GOOGLE;
  MICROSOFT;
  APPLE;
}



public class CompanyTest {

    public static void main(String[] args) {
        Employee[] employees = null;
        CompanyName companyName;
        
        
        Employee emp1= new Employee(18102060, "Irem");
        Employee emp2= new Employee(18102061, "Eda");
        Employee emp3= new Employee(18102062, "Gamze");
        Employee emp4= new Employee(18102063, "Ozlem");
        
        
        Employee[] emps= new Employee[]{emp1,emp2,emp3,emp4};
        Comp compi= new Comp(CompanyName.GOOGLE, emps);
        
       compi.printAllEmployees();
       compi.getAllEmployees();
       compi.getCompanyName();
               
        
        
        
        }
        
        
        
  