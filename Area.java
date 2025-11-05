package basics;

import java.util.Scanner;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :30-Oct-2025
 * Time	  :3:51:49 pm
 * Project :CoreJava
 * Calculate different shapes
*/
public class Area {
	public static void main(String[] args) {
		
		System.out.println("********Area Calculation Program*******");
		Scanner scanner = new Scanner(System.in);
		
		//Area of Circle
		System.out.println("Enter radius of the circle: ");
		double radius = scanner.nextDouble();
		double areaCircle = Math.PI * radius * radius;
		System.out.println("Area of the Circle: " + areaCircle);
		
		//Area of rectangle
		System.out.println("Enter length and width of rectangle");
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		double areaRectangle = length* width;
		System.out.println("Area of the Rectangle: " + areaRectangle);
		
		//area of triangle
		System.out.println("Enter base and height of the triangle: ");
		double base = scanner.nextDouble();
		double height = scanner.nextDouble();
		double areaTriangle = 0.5*base*height;
		System.out.println("Area of Triangle: " + areaTriangle);
		System.out.println("*********************");
		scanner.close();
		
	}

}
