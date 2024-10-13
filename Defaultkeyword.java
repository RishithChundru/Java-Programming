interface A{
    void run();
    void jump();
    default void show(){
        System.out.println("Show!");
    }
}
class B implements A{
    public void run(){
        System.out.println("Run!");
    }
    public void jump(){
        System.out.println("Jump!");
    }
}
public class Defaultkeyword {
    public static void main(String[] args){
        B obj=new B();
        obj.run();
        obj.jump();
        obj.show();
    }
}
