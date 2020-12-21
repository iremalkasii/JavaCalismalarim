
public class Student {
    int rollno;
    String name;
    static String collage= "KBU";
  
    
    public Student(int r, String n){
        this.rollno=r;
        this.name=n;
        collage ="KBU University";
    }

    
    public void display(){
    
        System.out.println(this.rollno+" "+this.name + " "+ collage);
    }
}


