package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InaccessibleObjectException;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :30-Oct-2025
 * Time	  :4:23:42 pm
 * Project :CoreJava
 * A java program to calculate simple interest using BufferedReader.
 */
public class SimpleInterest_BufferReader {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("******************Simple Interest Calculation********************");

		System.out.println("Enter Customer Name");
		String name = br.readLine();

		System.out.println("Enter Customer's Age:");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Enter Principal amount: ");
		double principal = Double.parseDouble(br.readLine());

		System.out.println("Enter Rate of interest ( % per annum): ");
		double rate = Double.parseDouble(br.readLine());

		System.out.println("Enter Time period (in years): ");
		double time = Double.parseDouble(br.readLine());

		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Simple Interest: " + String.format("%.2f", simpleInterest));

		br.close();

	}

}
