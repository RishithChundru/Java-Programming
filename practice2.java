import java.util.Scanner;
public class practice2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        int rollno=sc.nextInt();
        Student obj=new Student(name,age,rollno);  
        obj.show();

    }
}
class Teacher{
    String name;
    int age;
    Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class Student extends Teacher{
    int rollno;
    Student(String name,int age,int rollno){
        super(name,age);
        this.rollno=rollno;
    }
    void show(){
        super.show();
        System.out.println("Roll No: "+rollno);
    }
}
