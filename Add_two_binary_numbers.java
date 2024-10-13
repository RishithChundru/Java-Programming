import java.util.*;
public class Add_two_binary_numbers {
    static String add(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String res=Integer.toBinaryString(sum);
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x: ");
        String x=sc.nextLine();
        System.out.println("Enter y: ");
        String y=sc.nextLine();
        System.out.println(add(x,y));
    }
}
