/*import java.util.*;
class Teacher{
    String  name;
    int id;
    public Teacher(String name,int id){
        this.name=name;
        this.id=id;
    }
    void show(){
        System.out.println("Name is : "+name);
        System.out.println("Id id : "+id);
    }
}
class Student extends Teacher{
    int rollno;
    public Student(String name,int id,int rollno){
        super(name,id);
        this.rollno=rollno;
    }  
    void show(){
        super.show();
        System.out.println("Roll no is: "+rollno);
    }
}
public class Endterm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        int rollno=sc.nextInt();
        Student s=new Student(name, id, rollno);
        s.show();
    }
}
*/
/*import java.io.*;
import java.util.*;
public class Endterm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (Character.isLetter(ch)) {
                        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                            System.out.print(ch);
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(ch); 
                    }
                }
                System.out.println();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
*/

/*import java.util.*;
interface inter{
    public void show();
}
class teacher implements inter{
    public void show(){
        System.out.println("I am teacher");
    }
}
class Student extends teacher{
    public void show(){
        System.out.println("I am a Student");
    }
}
public  class Endterm{
    public static void main(String[] args){
        Student s=new Student();
        s.show();
        teacher t=new teacher();
        t.show();
    }   
}*/
/*@FunctionalInterface
interface maths{
    void show();
}
public class lambda{
    public static void main(String args[]){
        maths m=()->System.out.println("hi lambda");
        m.show();
    }
}*/

/* 
import java.util.*;
import java.io.*;
class a{
    void show(){
        System.out.println("In class a");
    }
    class b{
        void show(){
            System.out.println("in class b");
        }
    }
}
public class Endterm{
    public static void main(String[] args){
        a obj=new a();
        obj.show();
        a.b obj1=obj.new b();
        obj1.show();
    }
}
*/

/*import java.io.*;
import java.util.*;
public class Endterm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        try{
            FileReader fr=new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                for(int i=0;i<line.length();i++){
                    char c=line.charAt(i);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='I'||c=='O'||c=='E'||c=='U'){
                        System.out.print(c);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("Error!");
        }
    }
}*/
// import java.util.*;
// import java.io.*;
/*public class Endterm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        try{
            FileReader fr=new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);
            StringBuilder sb=new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                sb.append(line);
            }
            String content=sb.toString();
            int[] charcount=new int[128];
            for(char c: content.toCharArray()){
                if(Character.isLetter(c)){
                    charcount[c]++;
                }
            }
            char mostCommonChar=' ';
            int maxcount=0;
            for(int i=0;i<charcount.length;i++){
                if(charcount[i]>maxcount){
                    maxcount=charcount[i];
                    mostCommonChar=(char)i;
                }
            }
            System.out.println(mostCommonChar);
        }
        catch(Exception e){
            System.out.println("Error!");
        }
    }
}
*/
/*public class Enterm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        String filename1=sc.nextLine();
        try{
            FileInputStream fi=new FileInputStream(filename);
            FileOutputStream fo=new FileOutputStream(filename1);
            int line;
            while((line=fi.read())!=-1){
                fo.write(line);
            }
            fi.close();
            fo.close();
            FileReader fr=new FileReader(filename1);
            BufferedReader br=new BufferedReader(fr);
            String line1;
            while((line1=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
*/
/*public class Endterm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        StringBuilder sb = new StringBuilder();
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                sb.append(fileScanner.nextLine()).append("\n");
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            return;
        }

        String inputString = sb.toString();
        String longestWord = findLongestWord(inputString);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
*/
/*public class Endterm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        try{
            FileReader fr=new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                sb.append(line).append("\n");
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("error");
        }
        String content=sb.toString();
        String longestWord=findLongestword(content);
        System.out.println("Longest Word: "+longestWord);
    }
    public static String findLongestword(String str){
        String[] words=str.split("\\s+");
        String longestWord="";
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        return longestWord;
    }   
}

*/
/*public class Endterm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        try{
            FileReader fr=new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                sb.append(line).append("\n");
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
        String content=sb.toString();
        printFirstCharacter(content);
    }
    public static void printFirstCharacter(String str){
        StringBuilder res=new StringBuilder();
        boolean word=true;
        for(int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            if(Character.isLetter(currentchar) && word){
                res.append(currentchar);
                word=false;
            }
            if(currentchar==' '){
                word=true;
            }
        }
        System.out.println(res.toString());
    }
}*/

/*public class Endterm{
    public static void main(String[] args){
        ArrayList<Integer> arr1=new ArrayList<Integer>(5); 
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(4,5);
        for(Integer num:arr1){
            System.out.println(num);
        }
    }
}*/
/*import java.util.ArrayList;
import java.util.Collections;

public class Endterm {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);

        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + numbers);

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbers);
    }
}*/
