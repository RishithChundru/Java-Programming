// Reading the file
/*import java.util.*;
import java.io.*;
public class improvement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename=sc.nextLine();
        try{
            FileReader filereader=new FileReader(filename);
            BufferedReader br=new BufferedReader(filereader);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
*/

// Writing to file and reading the present content of file
/* 
import java.io.*;
import java.util.*;
public class improvement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename=sc.nextLine();
        try{
            FileWriter filewriter=new FileWriter(filename);
            BufferedWriter bw=new BufferedWriter(filewriter);
            for(int i=0;i<2;i++){
                String line=sc.nextLine();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("File Content added successfullly!!");
            FileReader filereader=new FileReader(filename);
            BufferedReader br=new BufferedReader(filereader);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}*/

// Appending content to file and reading the content

/*import java.io.*;
import java.util.*;
public class improvement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename=sc.nextLine();
        try{
            FileWriter filewriter=new FileWriter(filename,true);
            BufferedWriter bw=new BufferedWriter(filewriter);
            System.out.println("Enter content to append: ");
            String line=sc.nextLine();
            bw.write(line);
            bw.close();

            System.out.println("The new content is:  ");
            FileReader filereader=new FileReader(filename);
            BufferedReader br=new BufferedReader(filereader);
            String line1;
            while((line1=br.readLine())!=null){
                System.out.println(line1);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}*/

// most frequent characters in a word

/*import java.util.*;
import java.io.*;
public class improvement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename=sc.nextLine();
        try{
            FileReader filereader=new FileReader(filename);
            BufferedReader br=new BufferedReader(filereader);
            StringBuilder sb=new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                sb.append(line);
            }
            br.close();
            String content=sb.toString();
            int[] charcount=new int[128];
            for(char c:content.toCharArray()){
                if(Character.isLetter(c)){
                    charcount[c]++;
                }
            }
            char mostcommon=' ';
            int maxcount=0;
            for(int i=0;i<charcount.length;i++){
                if(charcount[i]>maxcount){
                    maxcount=charcount[i];
                    mostcommon=(char)i;
                }
            }
            System.out.println("The most frequent character is: "+mostcommon);
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
*/

// using Streams
/*import java.util.*;
import java.io.*;
public class improvement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input file name: ");
        String inputfile=sc.nextLine();
        System.out.println("Enter output file name: ");
        String outputfile=sc.nextLine();
        try{
            FileInputStream inputstream=new FileInputStream(inputfile);
            FileOutputStream outputstream=new FileOutputStream(outputfile);
            int byteRead;
            while((byteRead=inputstream.read())!=-1){
                outputstream.write(byteRead);
            }
            inputstream.close();
            outputstream.close();
            FileReader filereader=new FileReader(outputfile);
            BufferedReader br=new BufferedReader(filereader);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}*/

// Longest word in a string

import java.io.*;
import java.util.*;
public class improvement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        try{
            FileReader filereader=new FileReader(filename);
            BufferedReader br=new BufferedReader(filereader);
            String line;
            while((line=br.readLine())!=null){
                sb.append(line).append("\n");
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
        String inputString=sb.toString();
        String longestString=findlongest(inputString);
        System.out.println("Longest Word: "+longestString);
    }
    public static String findlongest(String str){
        String[] words=str.split("\\s+");
        String longest="";
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        return longest;
    }
}