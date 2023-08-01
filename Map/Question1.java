/*
 * Iterate through a map and print the key(Employee Id) for all the elements that contains string
provided as an input to the map (The name of the employee). Create another method to add
elements to the map. The map should have an integer as the key(Employee Id) and the string as
value (Employee name).
 */



package javaprograms.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//creating map object
		Map<Integer,String> map=new HashMap<>();
		
		System.out.println("program to print all the keys corresponding to a particular string");
		boolean b=true;
		while(b)
		{
		System.out.println("Press 1 to add Employee");
		System.out.println("Press 2 to search id using employee name");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			System.out.println("Employee Name: ");
			String name=sc.next();
			
			System.out.println("Employee Id: ");
			int id=sc.nextInt();
			map.put(id, name);
			break;
		}
		case 2:
		{
			
			System.out.println("Enter employee name: ");
			String name=sc.next();
			for(Map.Entry<Integer,String> entry:map.entrySet())
			{
				if(name.equals(entry.getValue()))
				{
					System.out.print(entry.getKey()+"\t");
				}
			}
			System.out.println();
		break;
		}
		case 3:
			b=false;
		}
	}
	}
	}


