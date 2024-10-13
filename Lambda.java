/*@FunctionalInterface
interface maths{
    void show();
}
public class Lambda{
    public static void main(String args[]){
       maths m=()->System.out.println("hi lambda");
       m.show();
    }
}*/
//                                ********non static inner class********
/*class A{
    void show(){
        System.out.println("in show");
    }
    class B{
         void config(){
            System.out.println("in config");
         }
    }
}
public class Lambda{
    public static void main(String[] args){
        A obj=new A();
        obj.show();
        A.B obj1=obj.new B();
        obj1.config();
    }
}*/
//                                 *********static inner class**********
/*class A{
    void show(){
        System.out.println("In show");
    }
    static class B{
        void config(){
        System.out.println("In config");
        }
    }
}
public class Lambda{
    public static void main(String[] args){
        A obj=new A();
        obj.show();
        A.B obj1=new A.B();
        obj1.config();
    }
}*/
//                               **********Anonymous class*********
/*class A{
    void show(){
        System.out.println("In show");
    }
}
public class Lambda{
    public static void main(String[] args){
        A obj=new A(){
            void show(){
                 System.out.println("in anonymous class");
            }
        };
        obj.show();
    }
}
*/
//                              **********inner class*********
class A{
    void display(){
    class B{
        void show(){
            System.out.println("in show");
        }
    }
    B obj=new B();
    obj.show();
}
}
public class Lambda{
    public static void main(String[] args){
        A obj1=new A();
        obj1.display();  
    }
}