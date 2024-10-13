import java.util.*;
import java.io.*;
import java.math.*;
public class armstrong_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int n=0;
        int res=0;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            n++;
        }
        temp=num;
        while(temp!=0){
            int digit=temp%10;
            res+=Math.pow(digit,n);
            temp/=10;
        }
        if(res==num){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not a armstrong number");
        }
    }
}
