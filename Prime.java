import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number that upto which you want prime numbers: ");
        int num=sc.nextInt();
        if(num<=1){
            return;
        }
        for(int i=2;i<=num;i++){
           boolean isprime=true;
           for(int j=2;j*j<=i;j++){
            if(i%j==0){
                isprime=false;
                break;
            }
           }
           if(isprime){
            System.out.println(i+" ");
           }
        }
    }
}
