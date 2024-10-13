// Java Program to implement
// Abstract Method in Interface
import java.io.*;

// declaring an interface
interface Sum {
	// declaring abstract methods inside the interface
	public abstract int Operation_two_var(int a, int b);

	int Operation_three_var(int a, int b, int c);
}

// Main Class
public class abstractmethod implements Sum {
	public int Operation_two_var(int a, int b)
	{
		return a * b;
	}

	public int Operation_three_var(int a, int b, int c)
	{
		return a * b * c;
	}

	// main function
	public static void main(String args[])
	{
		abstractmethod object = new abstractmethod();
		System.out.println(
			object.Operation_two_var(10, 20));
		System.out.println(
			object.Operation_three_var(10, 20, 30));
	}
}
