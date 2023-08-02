/*
 * Create a Java program that prompts the user for an integer input and checks if it is 
 * an even number. If the number is even, print "It's an even number." If the number is 
 * odd or non-numeric, throw a custom exception called NotEvenNumberException with an 
 * informative message. Implement the NotEvenNumberException class.
 */

package exceptionhandling.q9.checkevennumber;

import java.util.Scanner;

class NotEvenNumberException extends RuntimeException
{
	NotEvenNumberException(String message)
	{
		super(message);
	}
}
public class EvenNumber {

	static int getNumber()
	{
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		String number=sc.next();
		try
		{
		return Integer.parseInt(number);
		}
		catch(NumberFormatException e)
		{
			throw new NotEvenNumberException(number+" is non numeric");
		}
	}
	public static void main(String[] args) {
		int x=getNumber();
		if(x%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			throw new NotEvenNumberException(x+" is not an even no");
		}
	}

}
