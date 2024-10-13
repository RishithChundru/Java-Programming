import java.util.*;
public class Leap_year {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int yr=sc.nextInt();
        boolean isleap=false;
        if(yr%4==0){
            isleap=true;
            if(yr%100==0){
                if(yr%400==0){
                    isleap=true;
                }
                else{
                    isleap=false;
                }
            }
        }
        else{
            isleap=false;
        }
        if(isleap){
            System.out.println(yr+" is a leap year");
        }
        else{
            System.out.println(yr+" is not a leap year");
        }
    }
}
