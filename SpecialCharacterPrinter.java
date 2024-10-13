import java.util.*;
/*public class SpecialCharacterPrinter{
    public static void printSpecialCharacters(String str){
        if(str.isEmpty()){
            System.out.println("String is Empty!");
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                System.out.print(ch+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("The special Characters are: ");
        printSpecialCharacters(str);
    }
}
*/
public class SpecialCharacterPrinter{
    public static void printSpecialCharacters(String str){
        if(str.isEmpty()){
            System.out.println("String is null!");
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch)){
                System.out.println(ch+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        System.out.println("The special characters are: ");
        printSpecialCharacters(str);
    }
}