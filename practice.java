import java.util.Scanner;
/*public class practice{
    String name;
    int reg_no;
    public practice(String name,int reg){
        this.name=name;
        reg_no=reg;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your registration number: ");
        int reg=sc.nextInt();
        practice res=new practice(name,reg);
        System.out.println("Name: "+ res.name);
        System.out.println(res.reg_no);
    }
}*/
/*interface test{
    void show();
}
class practice{
    public static void main(String[] args){
        test t=()->{System.out.println("Hi");};
        t.show();
    }
}*/
                                        // non static nested class
/*class A{
    private int rollno;
    private int reg;
    public A(int rollno,int reg){
        this.rollno=rollno;
        this.reg=reg;
    }
    void setdata(int rollno,int reg){
        int x=rollno;
        int y=reg;
    }
    void getdata(){
        System.out.println(rollno+"\t"+reg);
    }
    class B{
        void show(){
            System.out.println("Hi");
        }
    }
}
class practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        A obj=new A(x,y);
        obj.setdata(x,y);
        A.B obj1=obj.new B();
        obj1.show();

    }
}*/
class A{
    private int rollno;
    private int reg;
    public A(int rollno,int reg){
        this.rollno=rollno;
        this.reg=reg;
    }
    void setdata(int rollno,int reg){
        int x=rollno;
        int y=reg;
    }
    void getdata(){
        System.out.println(rollno+"\t"+reg);
    }
    static class B{
        void show(){
            System.out.println("Hi");
        }
    }
}
class practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        A obj=new A(x,y);
        obj.setdata(x,y);
        A.B obj1=new A.B();
        obj1.show();

    }
}