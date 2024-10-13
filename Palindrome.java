import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string/number: ");
        String res=sc.nextLine();
        String reversed= "";
        for(int i=res.length()-1;i>=0;i--){
            reversed+=res.charAt(i);
        }
        if(res.equals(reversed)){
            System.out.println("It is palindrome!");
        }
        else{
            System.out.println("It is not palindrome!");
        }
    }
}
