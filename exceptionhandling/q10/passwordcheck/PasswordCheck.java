/*
 * Design a Java program that asks the user to enter a password. Check if the password 
 * meets the criteria of having at least eight characters, containing both letters and 
 * numbers. If the password does not meet the criteria, throw a custom exception 
 * called InvalidPasswordException with a suitable message. Implement the 
 * InvalidPasswordException class
 */

package exceptionhandling.q10.passwordcheck;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidPasswordException extends RuntimeException
{
	InvalidPasswordException(String message)
	{
		super(message);
	}
}
public class PasswordCheck {
	static boolean isPasswordValid(String password)
	{
			String regex = "^(?=.*[a-zA-Z])(?=.*[0-9]).{8,}$";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(password);
		return m.matches();
	}
	public static void main(String[] args) {
		System.out.print("Enter Password: ");
		Scanner sc=new Scanner(System.in);
		String passwordByUser=sc.next();
		boolean flag=isPasswordValid(passwordByUser);
		if(flag)
		{
			System.out.println("passwrod matches the given criteria");
		}
		else
		{
			throw new InvalidPasswordException("Password does not meets the given criteria");
		}
	}

}
