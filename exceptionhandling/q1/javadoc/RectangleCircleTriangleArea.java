/*
Q->write a program to calculate Area of -Rectangle  
Make use of Appropriate annotations and javadoc .
*/

package exceptionhandling.q1.javadoc;

import java.util.Scanner;



/**
 * 
 * @author yogesh
 * @version 1.0
 * 
 */
public class RectangleCircleTriangleArea {

	/** 
	 * @param length this is the length of the rectangle
	 * @param width this is the width of the rectangle
	 * @return this is the area of rectangle
	 * 
	 */
	public static float areaOfRectangle(double length,double width)
	{
		float area=(float)(length*width);
		return area;
	}
	
	
	/**********************************************/
	
	
	/**
	 * 
	 * @param radius this is the radius of circle
	 * @return this method will return area of circle
	 */
	public static float areaOfCircle(double radius)
	{
		float area=(float)(3.14*Math.pow(radius, 2));
		return area;
	}
	
	
	/**********************************************/
	
	
	/**
	 * 
	 * @param base this is the base of Triangle
	 * @param height this is the height of Triangle
	 * @return this method will return area of Triangle
	 */
	
	public static float areaOfTriangle(double base,double height)
	{
		float area=(float)(0.5*base*height);
		return area;
	}
	
	
	/**
	 * @param args no parameters were taken
	 */
	public static void main(String[] args) {
		/**
		 * This method will print areas of Rectangle , Circle and Triangle
		 */
		 
		Scanner sc=new Scanner(System.in);
	
		//Area of rectangle
		System.out.println("Program for area of Rectangle");
		System.out.print("Enter length: ");
		double length=sc.nextDouble();
		System.out.print("Enter Width: ");
		double width=sc.nextDouble();
		float rectangleArea=areaOfRectangle(length,width);
		System.out.println("Area of rectangle is: "+rectangleArea);		
		System.out.println("-------------");
		
		//Area of circle
		System.out.println("Program for area of Rectangle");
		System.out.println("Enter radius`");
		double radius=sc.nextDouble();
		float circleArea=areaOfCircle(radius);
		System.out.println("Area of Circle is: "+circleArea);
		System.out.println("-------------");
		
		//Area of triangle
		System.out.println("Program for area of Triangle");
		System.out.print("Enter base: ");
		double base=sc.nextDouble();
		System.out.print("Enter height: ");
		double height=sc.nextDouble();
		float triangleArea=areaOfTriangle(base,height);
		System.out.println("Area of triangle is: "+triangleArea);	
	}
	

}
