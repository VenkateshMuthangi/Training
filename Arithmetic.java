package basics;

import java.util.Scanner;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :30-Oct-2025
 * Time	  :3:24:57 pm
 * Project :CoreJava
 * 
 * Java Program to demonstrate basic arithmentic operations using scanner for user input
*/
public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter your name: ");
		String name = scanner.next();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		
		System.out.println("****Arithmetic Operations****");
		System.out.println("Sum: " + sum);
		System.out.println("sub: " + sub);
		System.out.println("mul: " + mul);
		System.out.println("Div: " +div);
		System.out.println("*******************************************************************");
		System.out.println("Program Created by, " + name + " of age " + age);
		
		scanner.close();
		
	}

}
