import java.util.*;
public class LCM_GCD {
    static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    static int LCM(int a,int b){
        return(a/GCD(a,b))*b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println(LCM(a,b));
        System.out.println(GCD(a,b));
    }
}
