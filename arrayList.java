// Collections in java
//Lists
//types
// ArrayList
//Vector
//LinkedList
/*import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer>arr=new ArrayList<>();   //this will only accept integer variable since we provided Integer wrapper class in arrow
        ArrayList<Integer>arr2=new ArrayList<>(5);
        // ArrayList are dynamic no matter what we have provided in initial capacity
        arr2.add(0,3);
        arr2.add(1,3);
        System.out.println(arr+" "+arr2);  //this will print an empty arrayList and an arrayList with array elements
        //in normal way
        for(int i=0;i<arr2.size();i++)   //using size() instead of length()
            System.out.print(arr2.get(i)+" ");  //using get(i) instead of arr2[i]
        int[] arr3=new int[10];
        System.out.println(arr3);  //address will be printed
        List<Integer>arr4=new ArrayList<>();   //we can do this as well just like inheritance
        arr4.add(1);
        System.out.println(arr4);
    }
}*/


import java.util.ArrayList;
import java.util.Scanner;

public class arrayList{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store both Strings and Integers
        ArrayList<Object> mixedList = new ArrayList<>();

        // Set a flag to keep track of whether to continue input
        boolean continueInput = true;

        System.out.println("Enter inputs (integer or string). Type 'exit' to stop:");

        while (continueInput) {
            // Take the input as a string
            String input = scanner.nextLine();

            // Check if the input is 'exit', to stop the loop
            if (input.equals("exit ")) {
                continueInput = false;
            } else {
                // Try to parse the input as an integer
                try {
                    int number = Integer.parseInt(input);
                    mixedList.add(number); // Add the number to the list
                } catch (NumberFormatException e) {
                    // If parsing fails, it's a string, so add it to the list
                    mixedList.add(input);
                }
            }
        }

        // Print the elements of the ArrayList
        System.out.println("You entered the following elements:");
        for (Object element : mixedList) {
            System.out.println(element);
        }

        // Close the scanner
        scanner.close();
    }
}
