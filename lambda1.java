import java.util.Scanner;
interface A{
    String show(String str);
}
public class lambda1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        A a=(s)->{
            return str+"!";
        };
        String res=a.show(str);
        System.out.println(res);
    }
}
