import java.util.*;
import java.io.*;
class student{
    void display(String name,int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary=sc.nextInt();
        class teacher{
            void show(int salary){
                System.out.println("Salary: "+salary);
            }
        }
        
        teacher t=new teacher();
        t.show(salary);
    }
}
public class Localclass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        student s=new student();
        s.display(name, age);
    }
}
