import java.util.Scanner;
import java.util.*;
public class Box {
    int length;
    int breadth;
    public Box(int l,int b){
        length=l;
        breadth=b;
        
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(length*breadth);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth: ");
        int b=sc.nextInt();
        Box res = new Box(l,b);
    }
}
