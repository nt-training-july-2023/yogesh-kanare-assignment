//Design a Java program that defines a list of strings. The program should prompt the user for an index and display the 
//element at that index. Handle the scenario where the user enters an invalid index (out of bounds) or tries to access an 
//element from a null list. Throw appropriate exceptions (IndexOutOfBoundsException and NullPointerException) with 
//informative messages


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class StringIndex
{
	static List<String> list;
	public static void main(String ar[])
	{
		list=new ArrayList<>();
		//list.add("Yogesh");
		//list.add("Naveen");
		//list.add("Harsh");
		//list.add("Nabi");
		//list.add("Akash");
		String name=list.get(x);
		list.add("Madhur");
		System.out.println("The name at index "+x+" is : "+name);
	}	
}