package basics;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :30-Oct-2025
 * Time	  :4:16:49 pm
 * Project :CoreJava
*/
import java.util.Scanner;
public class ScannerNextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to demonstrate Scanner methods with Character & Strings & other data types input.


		char ch;
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter a Initial : ");
				ch=scan.next().charAt(0); // Single character Input
				scan.nextLine();
				System.out.println("Enter ur Full name: ");
				
				String fname=scan.nextLine();   // Multiple words String input
				
				System.out.println("Enter ur first name: ");
				String name=scan.next();
				
				System.out.println("Enter ur age: ");
				int a=scan.nextInt();
				
				System.out.println("Enter ur height: ");
				double h=scan.nextFloat();
				
				System.out.println("nextByte() method demo :");
				System.out.println("Enter ur weight: ");
				byte w=scan.nextByte();
				
				
				System.out.println();
				
				
				scan.close();
				
				System.out.println("Entered Character is :"+ch);
				
				System.out.println("First Name :"+name);
				System.out.println("Full Name :"+fname);
				
				System.out.println("Age :"+a);
				System.out.println("Height :"+h);
				System.out.println("Weight :"+w);
				

	}

}
