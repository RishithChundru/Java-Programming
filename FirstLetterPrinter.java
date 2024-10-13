import java.util.*;
import java.io.*;
import java.lang.*;
public class FirstLetterPrinter{
    static void printFirstLetter(String str){
        if(str.isEmpty()){
            System.out.println("String is Null!");
        }
        String[] word=str.split("\\s+");
        StringBuilder res=new StringBuilder();
        for(String w:word){
            if(!w.isEmpty()){
                res.append(w.charAt(0));
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str=sc.nextLine();
        System.out.println("The every first letter in the sentence are: ");
        printFirstLetter(str);
    }
}