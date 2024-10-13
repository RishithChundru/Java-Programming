import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
public class filehandling {
    public static String readFileToString(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        byte[] encodedBytes = Files.readAllBytes(filePath);
        return new String(encodedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            String fileContent = readFileToString(fileName);
            System.out.println("File content:");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


/*import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class filehandling {
    public static String readFileToString(String fileName) throws IOException {
        return Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            String fileContent = readFileToString(fileName);
            System.out.println("File content:");
            char[] arr=fileContent.toCharArray();
            System.out.println(arr.length);
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}*/


//program to print the exception information using printStackTrace() method 
  
