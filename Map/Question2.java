/*
 * Implement basic CRUD operations(Add,Remove,Update,Get) on the different types of Maps.
 */

package javaprograms.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
 public static void main(String ar[]) {
	System.out.println("CRUD Operations in using map");
	boolean b=true;
	Map<Integer,String> map=new HashMap<>();
	while(true)
	{
		System.out.println("Press 1 for add");
		System.out.println("Press 2 to remove");
		System.out.println("Press 3 to update");
		System.out.println("Press 4 to get");
		System.out.println("Press 5 to exit");
		System.out.println("Pres 6 to show map");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter Name: ");
			String name=sc.next();
			
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			map.put(id, name);
			break;
		}
		case 2:
		{
			System.out.println("Enter id to remove: ");
			int id=sc.nextInt();
			System.out.println("Map before removal"+map);
			if(map.containsKey(id))
			map.remove(id);
			System.out.println("map after removal"+map);
			break;
		}
		case 3:
		{
			System.out.println("Enter id to update its value: ");
			int id=sc.nextInt();
			System.out.println("Map before updation"+map);
			for(Map.Entry<Integer,String> entry:map.entrySet())
			{
				if(id==entry.getKey())
				{
					map.put(id, "updatedvalue");
				}
			}
			System.out.println("Map after updation"+map);
			break;
		}
		case 4:
		{
			System.out.println("Enter id to search: ");
			int id=sc.nextInt();
			System.out.println(map);
			map.containsKey(id);
			System.out.println(map.get(id));
			break;
		}
		case 5:
		{
			b=false;
			break;
		}
		case 6:
		{
			System.out.println(map);
		}
		}
	}
}
}
