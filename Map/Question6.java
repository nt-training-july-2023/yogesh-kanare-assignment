package javaprograms.Map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "ram");
		map.put(104, "sita");
		map.put(103, "Githa");
		map.put(105, "sita");
		System.out.println("Enter name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		List<Integer> list=new ArrayList<>();
		
		for(Map.Entry<Integer,String> entry:map.entrySet())
		{
			if(entry.getValue().equals(name))
			{
				list.add(entry.getKey());
			}
		}
		for(Integer i:list)
		{
			map.remove(i);
		}
		System.out.println(map);
	}

}
