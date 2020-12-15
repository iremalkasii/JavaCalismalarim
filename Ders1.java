
 */
package ders1;


 */

import sun.security.util.Length;

public class Ders1 {

  
//    public static void main(String[] args) {
//         int i;
//        String[] days ={"mon" ,"tues", "wed","thur","fri","sat","sund"};
//        for(i=0;i<days.length;i++){
//        {System.out.println(days[i]);
//        }
    
 
 public static void main(String[] args)
{
Student student =new Student();
student.finalExam=60;
student.id=1810206069;
student.midterm=50;
student.name="irem";


    System.out.println("student name:" +" "+ student.name + " ," + "midterm:" + " "+ student.midterm +" , "+ "final:"+ " "+ student.finalExam +"  ," + "avregare"+ " " + student.calculate());
 
 
 student.showAllInfo();
    
}
