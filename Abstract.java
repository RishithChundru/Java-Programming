abstract class A{
    int a;
    A(){
        System.out.println("Hi I am a 'A'");
    }
    void show(int x){
        System.out.println("a: "+x);
    }
} 
class B extends A{
    int b;
    B(){
        System.out.println("Hi I am a 'B'");
    }
    void show(int x,int y){
        super.show(x);
        System.out.println("b: "+y);
    }
}
public class Abstract {
    public static void main(String[] args){
    B obj=new B();
    obj.show(2,1);
}
}
