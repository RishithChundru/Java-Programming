import java.util.*;
/*public class classes {
    int a;
    int b;
    
    void set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void get(){
        System.out.println(a+b);
    }
    public static void main(String args[]){
        classes obj=new classes();
        obj.set();
        obj.get();

    }
}
*/
/*public class classes{
    int a;
    int b;
    public classes(int x,int y){
        a=x;
        b=y;
    }
    void get(){
        System.out.println(a*b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        classes obj=new classes(a, b);
        obj.get();
        }
}
*/
public class classes{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public static void main(String args[]){
        classes obj=new classes();
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));
        System.out.println(obj.sum(1.2,2.8));
    }
}