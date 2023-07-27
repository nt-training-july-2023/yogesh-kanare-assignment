//Design a Java program that simulates an ATM machine. Prompt the user to enter their account balance and the amount they want to withdraw. Handle the scenario where the user enters non-numeric or negative values for balance or withdrawal amount. If any invalid inputs are detected, throw a custom exception called InvalidInputException with an appropriate error message. Implement the InvalidInputException class.

import java.util.*;
class InvalidInputException extends RuntimeException
{
	InvalidInputException()
	{
		
	}
	InvalidInputException(String s)
	{
		super(s);
	}
}
class Atm
{
public static void main(String ar[])
{
	int x=getWithDrawableAmount();
	
	if(x>=0)
	{	
	System.out.println("welcome");
	}
	else
	{
	throw new InvalidInputException("invalid amout");
	}		
}	
public static int getWithDrawableAmount()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Withdrawal Amount: ");
	String amount=sc.next();
	try
	{
		return Integer.parseInt(amount);
	}catch(NumberFormatException e)
	{
		throw new InvalidInputException(""+amount+" is invalid");
	}
}
}