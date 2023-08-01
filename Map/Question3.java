/*
Given an integer representing the threshold size, write a method which would print all the
elements existing in the map and then clear the map if the size of the map is equal to or greater
than the threshold size provided as input. There would be another method which would add the
elements in the map
*/
package javaprograms.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {

	static Map<Integer, String> map = new HashMap<>();
	static void addMap(int key,String value)
	{
		map.put(key,value);
	}
	public static void main(String[] args) {
		System.out.println("Enter threshhold size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		boolean b=true;
		while(b)
		{
		if(map.size()<=size)
		{
			System.out.println("Enter key: ");
			int key=sc.nextInt();
			
			System.out.println("Enter value: ");
			String value=sc.next();
			addMap(key,value);
		}
		else
		{
			map.clear();		
			System.out.println("\n\nMy map after clear: "+map);
			b=false;
		}
		System.out.println("\n\nMy map now: "+map);
		}
	}

}
