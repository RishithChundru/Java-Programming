import java.util.Scanner;
class teacher implements Runnable{
    String name;
    int age;
    public void run(){
        System.out.println("Enter data: ");
    }
    void setdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter age: ");
        age=sc.nextInt();
    }
    void get(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
    }
}
class student extends teacher{
    int fee;
    void getdata(){
        super.setdata();
        super.get();
        System.out.println("fee: "+fee);
    }
}
public class thread1 {
    public static void main(String[] args){
        student s=new student();
        s.getdata();
    }
}
