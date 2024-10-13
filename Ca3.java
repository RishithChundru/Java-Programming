/*import java.io.*;
import java.util.Scanner;

public class Ca3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
*/
/* 
import java.io.*;
import java.util.Scanner;
public class Ca3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("file name: ");
        String filename=sc.nextLine();
        try{
            FileReader reader=new FileReader(filename);
            BufferedReader br=new BufferedReader(reader);
            String line;
            System.out.println("File Content: ");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
           // br.close();
        }
        catch(Exception e){
            System.out.println("Error!");
        }
        finally{
            sc.close();
        }
    }
}
*/
/*import java.io.*;
import java.util.Scanner;
public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name: ");
        String filename = sc.nextLine();
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            int n=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter content to write to the file: ");
            for(int i=0;i<n;i++){
            String line = sc.nextLine();
            bw.write(line);
            bw.newLine();
            }
            bw.close();
            //  while (sc.hasNextLine()) {
            //     String line = sc.nextLine();
            //     bw.write(line);
            //     bw.newLine();
            // }
            // bw.close();
            System.out.println("Content has been written to the file successfully.");
            FileReader reader=new FileReader(filename);
            BufferedReader br=new BufferedReader(reader);
            String line1;
            System.out.println("file content: ");
            while((line1=br.readLine())!=null){
                System.out.println(line1);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            sc.close();
        }
    }
}
*/
/*import java.io.*;
import java.util.Scanner;
public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name: ");
        String filename = sc.nextLine();
        try {
            FileWriter writer = new FileWriter(filename,true);
            BufferedWriter br = new BufferedWriter(writer);
            System.out.println("Enter content to append to the file: ");
            String line = sc.nextLine();
            br.write(line);
            br.close();
            // while (sc.hasNextLine()) {
            //     String line = sc.nextLine();
            //     br.write(line);
            //     br.newLine();
            // }
            System.out.println("Content has been appended to the file successfully.");
            FileReader reader=new FileReader(filename);
            BufferedReader bw=new BufferedReader(reader);
            String line1;
            System.out.println("file content: ");
            while((line1=bw.readLine())!=null){
                System.out.println(line1);
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            sc.close();
        }
    }
}*/

/*import java.io.*;
import java.util.Scanner;

public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name: ");
        String filename = sc.nextLine();
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            System.out.println("Enter content to write to the file: ");
            String line;
            while (!(line = sc.nextLine()).isEmpty())  {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("Content has been written to the file successfully.");
            FileReader reader=new FileReader(filename);
            BufferedReader br=new BufferedReader(reader);
            String line1;
            System.out.println("file content: ");
            while((line1=br.readLine())!=null){
                System.out.println(line1);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            sc.close();
        }
    }
}
*/
/*import java.io.*;
import java.util.Scanner;

public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name: ");
        String filename = sc.nextLine();
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            System.out.println("Enter content to write to the file (press Enter on an empty line to finish): ");
            String line;
            while (!(line = sc.nextLine()).isEmpty()) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("Content has been written to the file successfully.");
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String line1;
            System.out.println("file content: ");
            while ((line1 = br.readLine()) != null) {
                System.out.println(line1);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            sc.close();
        }
    }
}
*/

                                            //most frequent characters in word
/*import java.io.*;
import java.util.Scanner;
public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("file name: ");
        String filename = sc.nextLine();
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            String content = sb.toString();
            int[] charCount = new int[128]; 
            for (char c : content.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount[c]++;
                }
            }
            char mostCommonChar = ' ';
            int maxCount = 0;
            for (int i = 0; i < charCount.length; i++) {
                if (charCount[i] > maxCount) {
                    maxCount = charCount[i];
                    mostCommonChar = (char) i;
                }
            }
            System.out.println("Most commonly used character: " + mostCommonChar);
        } catch (Exception e) {
            System.out.println("Error!");
        } finally {
            sc.close();
        }
    }
}
*/
                                    //using streams
/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class Ca3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inputFile = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outputFile = scanner.nextLine();

        try {
            FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

            inputStream.close();
            outputStream.close();
            System.out.println("File copied successfully.");
            FileReader reader=new FileReader(outputFile);
            BufferedReader br=new BufferedReader(reader);
            String line;
            System.out.println("file content: ");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
*/
                                //longest word in a string
/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ca3 {
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
/*import java.io.*;
import java.util.*;
public class Ca3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        try{
            Scanner fileScanner=new Scanner(new File(filename));
            while(fileScanner.hasNext()){
                sb.append(fileScanner.nextLine()).append("\n");
            }
        }
        catch(Exception e){
            System.out.println("Error!");
        }
        String inputString=sb.toString();
        String longestWord=findLongest(inputString);
        System.out.println("Longest Word: "+longestWord);
    }
    public static String findLongest(String str){
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
                                    // concatenate two files content 
/*import java.io.*;
import java.util.*;

public class Ca3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first file name: ");
        String filename1=sc.nextLine();
        System.out.println("Enter second file name: ");
        String filename2=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        // Read content from the first file
        try{
            Scanner fileScanner1=new Scanner(new File(filename1));
            while(fileScanner1.hasNext()){
                sb.append(fileScanner1.nextLine()).append("\n");
            }
            fileScanner1.close();
        } catch(Exception e){
            System.out.println("Error reading file: " + filename1);
            return;
        }

        // Read content from the second file
        try{
            Scanner fileScanner2=new Scanner(new File(filename2));
            while(fileScanner2.hasNext()){
                sb.append(fileScanner2.nextLine()).append("\n");
            }
            fileScanner2.close();
        } catch(Exception e){
            System.out.println("Error reading file: " + filename2);
            return;
        }

        // Output the concatenated content
        System.out.println("Concatenated content:");
        System.out.println(sb.toString());
    }
}
*/
                                  // printing first character from each word in sentence
/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
        String sentence = readSentenceFromFile(fileName);
        printFirstCharacters(sentence);
        sc.close();
    }
    public static String readSentenceFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                sb.append(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
        return sb.toString();
    }
    public static void printFirstCharacters(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean newWord = true; 
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isLetter(currentChar) && newWord) {
                result.append(currentChar); 
                newWord = false; 
            }
            if (currentChar == ' ') {
                newWord = true;
            }
        }
        System.out.println("First characters from each word: " + result.toString());
    }
}
*/
                                        // removing first character from each word
/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ca3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
        String sentence = readSentenceFromFile(fileName);
        printSentenceWithFirstCharactersRemoved(sentence);
        sc.close();
    }
    public static String readSentenceFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                sb.append(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
        return sb.toString();
    }
    public static void printSentenceWithFirstCharactersRemoved(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean newWord = true; 
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isLetter(currentChar) && newWord) {
                newWord = false; 
            } else {
                result.append(currentChar); 
            }
            if (currentChar == ' ') {
                newWord = true; 
            }
        }
        System.out.println("Sentence with first characters removed: " + result.toString());
    }
}
*/




                                                 // Generic classes

/*import java.util.Scanner;
class Pair<T, U> {
    private T first;
    private U second;
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(U second) {
        this.second = second;
    }
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
public class Ca3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value:");
        int firstValue = scanner.nextInt();
        System.out.println("Enter second value:");
        double secondValue = scanner.nextDouble();
        Pair<Integer, Double> pair = new Pair<>(firstValue, secondValue);
        System.out.println("Pair: " + pair);
        scanner.close();
    }
}
*/
                                        // changing string to character array
/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;
public class Ca3 {
    public static void main(String[] args) {
        // Specify the file path
        Scanner sc=new Scanner(System.in);
        System.out.println("file name: ");
        String filePath = sc.nextLine();

        try {
            // Open the file
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the string from the file
            String inputString = bufferedReader.readLine();

            // Close the file
            bufferedReader.close();

            // Convert the string to a character array
            char[] charArray = inputString.toCharArray();

            // Print each character in sequence
            for (char c : charArray) {
                if (!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
                    System.out.println(c);
                }
                
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
*/
                                // deleting a file
/*import java.io.*;
import java.util.*;
public class Ca3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        File file=new File(filename);
        if(file.delete()){
            System.out.println("deleted successfully");
        }
        else{
            System.out.println("not done");
        }
}
}
*/
                                 // checking file exist or not
 
import java.io.File;
import java.util.*;
public class Ca3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        File file=new File(filename);
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}                