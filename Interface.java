import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
/*interface A{
    public void display();
}
class B implements A{
    public void display(){
        System.out.println("B");
    }
}
public class Interface {
    public static void main(String[] args){
        B obj=new B();
        obj.display();
    }
}
*/
/*interface student{
    public void display();
}
class Rishith implements student{
    public void display(){
        System.out.println("Name: Rishith");
        System.out.println("Age: 19");
    }
}
public class Interface{
    public static void main(String[] args){
    Rishith r=new Rishith();
    r.display();
}
}
*/
interface Bank{
    void deposit(int x);
    void withdraw(int y);
    void loan();
    void Amount();
}
abstract class p implements Bank{
    public void deposit(int x){
        System.out.println("Deposited Amount : "+x);
    }
}
abstract class P2 extends p{
    public void withdraw(int y){
        System.out.println("Withdrawn Amount : "+y);
    }
}
class P3 extends P2{
    public void loan(){
        System.out.println("loan amount : 2000");
    }
    public void Amount(){
        System.out.println("Amount: 5000");
    }
}
public class Interface{
    public static void main(String[] args){
        P3 obj=new P3();
        obj.deposit(1000);
        obj.withdraw(100);
        obj.loan();
        obj.Amount();
    }
}