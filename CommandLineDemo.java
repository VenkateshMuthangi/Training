package basics;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :30-Oct-2025
 * Time	  :12:47:24 pm
 * Project :CoreJava
 * Java Program to demonstrate command-line arguments
*/
public class CommandLineDemo {

	public static void main(String[] args) {
		
		if (args.length < 3) {
			System.out.println("Please provide two numbers & name as command-line arguments.");
			return;
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String name = args[2];
		
		int sum = num1 + num2;
		
		System.out.println("Hello, " + name + "!");
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum );

	}

}
