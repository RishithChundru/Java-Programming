import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String name=sc.nextLine();
        String reversed=" ";
        for(int i=name.length()-1;i>=0;i--){
            reversed+=name.charAt(i);
        }
        System.out.println(reversed);
    }
}
