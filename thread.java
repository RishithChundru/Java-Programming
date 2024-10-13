import java.util.Scanner;

/*class nthread implements Runnable{
   public void run(){
        System.out.println("In thread class");
    }
}
class newthread extends thread{
    public void run(){
        System.out.println("In new thread class");
    }
}
public class thread{
    public static void main(String[] args){
        nthread t=new nthread();
        newthread n=new newthread();
        n.run();
        t.run();
        System.out.println("In the main");
    }
}
*/
/* 
public class thread extends Thread{
    public static void main(String[] args){
        thread t=new thread();
        t.start();
        System.out.println("Outside the thread");
    }
     public void run(){
    System.out.println("Inside thread");}
}
*/
//                                     *********USING RUNNABLE**********
public class thread implements Runnable{
    public static void main(String[] args){
        thread t=new thread();
        Thread a=new Thread(t);
        a.start();
        System.out.println("Outside the class");
    }
    public void run(){
        System.out.println("Inside the thread");
    }
    
}

