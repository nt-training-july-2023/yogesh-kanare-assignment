/*
 * Write a Java program that initializes an array of integers and prompts the user for 
 * an index to access an element. Handle the scenario where the user enters an 
 * invalid index (out of bounds) or tries to access an element from a null array. 
 * Throw appropriate exceptions (IndexOutOfBoundsException and NullPointerException) 
 * with informative messages.

 */
package exceptionhandling.q7.array;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		//initializing array of integers
		int x[]= {10,3,100,50,587,56,34};
		System.out.print("Enter index no.: ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		try
		{
			System.out.println(x[index]);
		}
		catch(NullPointerException e1)
		{
			throw new NullPointerException("your array is empty");
		}
		catch(IndexOutOfBoundsException e1)
		{
			throw new IndexOutOfBoundsException("index not available");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}

}
