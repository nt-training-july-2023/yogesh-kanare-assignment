//Write a Java program that contains a method to calculate the area of a rectangle. The method takes two positive integer parameters representing the length and width of the rectangle. However,
// the method should throw a custom exception called InvalidDimensionException if either
// the length or width is less than or equal to zero. Implement the InvalidDimensionException class with an appropriate message. Test the method with valid 
//and invalid inputs

import java.util.*;
class InvalidDimensionException extends RuntimeException
{
	InvalidDimensionException()
	{
		
	}
	InvalidDimensionException(String s)
	{
		super(s);
	}
}
class AreaOfRectangle
{
public static void main(String ar[])
{
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter length : ");
	int length=sc.nextInt();
	System.out.print("Enter width : ");
	int width=sc.nextInt();
	if(length<=0||width<=0)
	{
		throw new InvalidDimensionException("Invalid dimension");
	}
	else
	{
		System.out.println("Area is : "+(length*width));
	}

}
}