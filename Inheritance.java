import java.util.*;
import java.io.*;
/*class student{
    private String name;
    private int reg;
    public student(String name,int reg){
        this.name=name;
        this.reg=reg;
    }
    public String getData(){
        return ("Name is "+name+" reg is "+reg);
    }
}
class Inh extends student{
    private int rollno;
    public Inh(String name,int reg,int rollno){
        super(name,reg);
        this.rollno=rollno;
    }
    public String getData(){
        return (super.getData()+" Roll no is"+ rollno);
    }
}
public class Inheritance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int reg=sc.nextInt();
        int rollno=sc.nextInt();
        Inh i=new Inh(name,reg,rollno);
        System.out.println(i.getData());
    }
}
*/
/*class Bike{
    private String brand;
    private String model;
    Bike(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}
class Car extends Bike{
    private int NoOfSeats;
    Car(String brand,String model,int NoOfSeats){
        super(brand,model);
        this.NoOfSeats=NoOfSeats;
    }
    void show(){
        super.show();
        System.out.println("No of Seats :"+NoOfSeats);
    }
}
public class Inheritance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter brand name: ");
        String brand=sc.nextLine();
        System.out.println("Enter model name: ");
        String model=sc.nextLine();
        System.out.println("Enter No of Seats: ");
        int NoOfSeats=sc.nextInt();
        Bike b=new Bike(brand,model);
        Car c=new Car(brand,model,NoOfSeats);
        System.out.println("Bike Information: ");
        b.show();
        System.out.println("Car Information: ");
        c.show();
    }
}
*/

class parent{
    public String surname;
    public long telnum;
    public parent(String sname,long tnum){
        this.surname=sname;
        this.telnum=tnum;
    }
    void show(){
        System.out.println("surname: "+surname);
        System.out.println("telnum: "+telnum);
    }
}
class Son extends parent{
    public int age;
    public Son(String sname,long tnum,int age){
        super(sname,tnum);
        this.age=age;
    }
    void show(){
        super.show();
        System.out.println("Age: "+age);
    }
}
public class Inheritance{
    public static void main(String args[]){
        Son obj=new Son("Chundru",949088838,20);
        obj.show();
    }
}