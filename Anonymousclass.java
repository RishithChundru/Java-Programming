import java.util.*;
import java.io.*;
class student{
    void getdata(String name,int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Anonymousclass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        student s=new student(){
            void getdata(String name,int age){
                System.out.println("Details of student is: ");
                super.getdata(name,age);
            }
        };
        s.getdata(name,age);
    }
}
