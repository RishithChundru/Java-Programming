import java.util.*;
import java.io.*;

class teacher{
    void getdata(String name,int age){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
    static class student{
        void getdata(double fee){
            System.out.printf("Fee is: %.2f",fee);
        }
    }
}
public class staticmethod {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        System.out.println("Enter fee: ");
        double fee=sc.nextDouble();
        teacher t=new teacher();
        t.getdata(name,age);
        teacher.student s=new teacher.student();
        s.getdata(fee);
}
}